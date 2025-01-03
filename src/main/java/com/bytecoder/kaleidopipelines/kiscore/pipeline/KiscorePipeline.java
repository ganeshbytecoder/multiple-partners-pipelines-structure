package com.bytecoder.kaleidopipelines.kiscore.pipeline;

import com.bytecoder.kaleidopipelines.controller.Pipeline;
import com.bytecoder.kaleidopipelines.kiscore.featurecreation.FeatureCreation;
import com.bytecoder.kaleidopipelines.kiscore.featurecreation.FeatureCreationFactory;
import com.bytecoder.kaleidopipelines.kiscore.featurecreation.PartnerType;
import com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures.FeatureType;
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
            throw new IllegalArgumentException("Commands must contain at least 3 elements: KISCORE, operation type, and operation subtype");
        }

        String pipelineType = commands.get(0);
        if (!"KISCORE".equals(pipelineType.toUpperCase())) {
            throw new IllegalArgumentException("Invalid pipeline type: " + pipelineType);
        }

        String partnerTypeStr = commands.get(1);
        String kiscorePipelineType = commands.get(2);
        String kiscorePipelineSubType = commands.size() > 3 ? commands.get(3) : null;

        logger.info("Executing KISCORE pipeline with partner: {}, operation: {}, subtype: {}", 
                   partnerTypeStr, kiscorePipelineType, kiscorePipelineSubType);

        switch (kiscorePipelineType.toUpperCase()) {
            case "INGEST":
                logger.info("Executing ingest step");
                // featureCreation.ingest();
                break;
            case "VALIDATE":
                logger.info("Executing validate step");
                // featureCreation.validate();
                break;
            case "FEATURE_CREATION":
                if (kiscorePipelineSubType == null) {
                    throw new IllegalArgumentException("Feature type must be specified for FEATURE_CREATION");
                }
                logger.info("Creating features of type: {}", kiscorePipelineSubType);
                FeatureCreation featureCreation = FeatureCreationFactory.createFeatureCreation(PartnerType.valueOf(partnerTypeStr));
                featureCreation.createFeatures(FeatureType.valueOf(kiscorePipelineSubType));
                break;
            default:
                logger.warn("Unknown command: {}", kiscorePipelineType);
                throw new IllegalArgumentException("Unknown pipeline type: " + kiscorePipelineType);
        }
        logger.info("Completed pipeline execution for partner type: {}", partnerTypeStr);
    }
}
