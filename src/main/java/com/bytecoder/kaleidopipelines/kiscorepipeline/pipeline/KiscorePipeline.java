package com.bytecoder.kaleidopipelines.kiscorepipeline.pipeline;

import com.bytecoder.kaleidopipelines.controller.Pipeline;
import com.bytecoder.kaleidopipelines.kiscorepipeline.common.KiscoreIngestionType;
import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.KiscoreIngestion;
import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.factory.KiscoreIngestionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KiscorePipeline implements Pipeline {
    private static final Logger logger = LoggerFactory.getLogger(KiscorePipeline.class);

    @Override
    public void execute(List<String> commands) {
        if (commands == null || commands.size() < 3) {
            throw new IllegalArgumentException("Commands must contain: KISCORE, partner type, and ingestion type");
        }

        String pipelineType = commands.get(0);
        if (!"KISCORE".equals(pipelineType.toUpperCase())) {
            throw new IllegalArgumentException("Invalid pipeline type: " + pipelineType);
        }

        String partnerType = commands.get(1);
        String ingestionTypeStr = commands.get(2);

        try {
            KiscoreIngestionType ingestionType = KiscoreIngestionType.fromCode(ingestionTypeStr);
            logger.info("Creating Kiscore pipeline for partner: {} with ingestion type: {}", 
                       partnerType, ingestionType);

            KiscoreIngestion ingestion = KiscoreIngestionFactory.createIngestion(partnerType, ingestionType);
            ingestion.ingestData();

            logger.info("Completed Kiscore pipeline execution");
        } catch (IllegalArgumentException e) {
            logger.error("Invalid ingestion type: {}", ingestionTypeStr);
            throw e;
        } catch (Exception e) {
            logger.error("Error executing Kiscore pipeline: {}", e.getMessage(), e);
            throw new RuntimeException("Pipeline execution failed", e);
        }
    }
}
