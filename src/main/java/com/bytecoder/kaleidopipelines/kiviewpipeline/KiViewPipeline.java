package com.bytecoder.kaleidopipelines.kiviewpipeline;

import com.bytecoder.kaleidopipelines.controller.Pipeline;
import com.bytecoder.kaleidopipelines.kiviewpipeline.base.DefaultIngestionPipeline;
import com.bytecoder.kaleidopipelines.kiviewpipeline.base.DefaultRiskPipeline;
import com.bytecoder.kaleidopipelines.kiviewpipeline.factory.IngestionPipelineFactory;
import com.bytecoder.kaleidopipelines.kiviewpipeline.factory.RiskPipelineFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class KiViewPipeline implements Pipeline {
    private static final Logger logger = LoggerFactory.getLogger(KiViewPipeline.class);

    @Override
    public void execute(List<String> commands) {
        if (commands == null || commands.size() < 4) {
            throw new IllegalArgumentException("Commands must contain: KIVIEW, partner type, operation type, and load type");
        }

        String pipelineType = commands.get(0);
        if (!"KIVIEW".equals(pipelineType.toUpperCase())) {
            throw new IllegalArgumentException("Invalid pipeline type: " + pipelineType);
        }

        String partnerType = commands.get(1);
        String operationType = commands.get(2);
        String loadTypeStr = commands.get(3);

        LoadType loadType;
        try {
            loadType = LoadType.valueOf(loadTypeStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid load type: " + loadTypeStr);
        }

        logger.info("Executing KiView pipeline for partner: {}, operation: {}, load type: {}", 
                   partnerType, operationType, loadType);

        switch (operationType.toUpperCase()) {
            case "INGESTION":
                DefaultIngestionPipeline ingestionPipeline = IngestionPipelineFactory.createPipeline(partnerType);
                executeIngestionPipeline(ingestionPipeline, loadType);
                break;
            case "RISK":
                DefaultRiskPipeline riskPipeline = RiskPipelineFactory.createPipeline(partnerType);
                executeRiskPipeline(riskPipeline, loadType);
                break;
            default:
                throw new IllegalArgumentException("Unknown operation type: " + operationType);
        }

        logger.info("Completed KiView pipeline execution");
    }

    private void executeIngestionPipeline(DefaultIngestionPipeline pipeline, LoadType loadType) {
        switch (loadType) {
            case ONETIME_LOAD:
                pipeline.executeOneTimeLoad();
                break;
            case INCREMENTAL_LOAD:
                pipeline.executeIncrementalLoad();
                break;
        }
    }

    private void executeRiskPipeline(DefaultRiskPipeline pipeline, LoadType loadType) {
        switch (loadType) {
            case ONETIME_LOAD:
                pipeline.executeOneTimeLoad();
                break;
            case INCREMENTAL_LOAD:
                pipeline.executeIncrementalLoad();
                break;
        }
    }

    private enum LoadType {
        ONETIME_LOAD,
        INCREMENTAL_LOAD
    }
}
