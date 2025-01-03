package com.bytecoder.kaleidopipelines.kiviewpipeline.factory;

import com.bytecoder.kaleidopipelines.kiviewpipeline.PartnerType;
import com.bytecoder.kaleidopipelines.kiviewpipeline.base.DefaultIngestionPipeline;
import com.bytecoder.kaleidopipelines.kiviewpipeline.partners.sonata.SonataIngestionPipeline;
import com.bytecoder.kaleidopipelines.kiviewpipeline.partners.veritas.VeritasIngestionPipeline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngestionPipelineFactory {
    private static final Logger logger = LoggerFactory.getLogger(IngestionPipelineFactory.class);

    public static DefaultIngestionPipeline createPipeline(String partnerTypeStr) {
        try {
            PartnerType partnerType = PartnerType.valueOf(partnerTypeStr.toUpperCase());
            return createPipeline(partnerType);
        } catch (IllegalArgumentException e) {
            logger.warn("Unknown partner type: {}. Using default ingestion pipeline", partnerTypeStr);
            return new DefaultIngestionPipeline();
        }
    }

    public static DefaultIngestionPipeline createPipeline(PartnerType partnerType) {
        switch (partnerType) {
            case SONATA:
                return new SonataIngestionPipeline();
            case VERITAS:
                return new VeritasIngestionPipeline();
            case DEFAULT:
            default:
                return new DefaultIngestionPipeline();
        }
    }
}
