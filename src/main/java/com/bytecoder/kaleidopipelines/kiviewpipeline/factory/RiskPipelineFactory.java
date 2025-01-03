package com.bytecoder.kaleidopipelines.kiviewpipeline.factory;

import com.bytecoder.kaleidopipelines.kiviewpipeline.PartnerType;
import com.bytecoder.kaleidopipelines.kiviewpipeline.base.DefaultRiskPipeline;
import com.bytecoder.kaleidopipelines.kiviewpipeline.partners.sonata.SonataRiskPipeline;
import com.bytecoder.kaleidopipelines.kiviewpipeline.partners.veritas.VeritasRiskPipeline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RiskPipelineFactory {
    private static final Logger logger = LoggerFactory.getLogger(RiskPipelineFactory.class);

    public static DefaultRiskPipeline createPipeline(String partnerTypeStr) {
        try {
            PartnerType partnerType = PartnerType.valueOf(partnerTypeStr.toUpperCase());
            return createPipeline(partnerType);
        } catch (IllegalArgumentException e) {
            logger.warn("Unknown partner type: {}. Using default risk pipeline", partnerTypeStr);
            return new DefaultRiskPipeline();
        }
    }

    public static DefaultRiskPipeline createPipeline(PartnerType partnerType) {
        switch (partnerType) {
            case SONATA:
                return new SonataRiskPipeline();
            case VERITAS:
                return new VeritasRiskPipeline();
            case DEFAULT:
            default:
                return new DefaultRiskPipeline();
        }
    }
}
