package com.bytecoder.kaleidopipelines.kiscore.featurecreation.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.FeatureCreation;
import com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures.FeatureType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SonataFeatureCreation implements FeatureCreation {
    private final Logger logger = LoggerFactory.getLogger(SonataFeatureCreation.class);

    @Override
    public void createFeatures(FeatureType featureType) {
        switch (featureType) {
            case MFI:
                new SonataMFIFeatures(logger).createFeatures();
                break;
            case RETAIL:
                new SonataRetailFeatures(logger).createFeatures();
                break;
            case OVERALL:
                new SonataOverallFeatures(logger).createFeatures();
                break;
            case DEMOGRAPHIC:
                new SonataDemographicFeatures(logger).createFeatures();
                break;
            case OTHER:
                new SonataOtherFeatures(logger).createFeatures();
                break;
            case REPAYMENT:
                new SonataRepaymentFeatures(logger).createFeatures();
                break;
            default:
                logger.warn("Unsupported feature type: {}", featureType);
        }
    }

    @Override
    public String getPartnerName() {
        return "SONATA";
    }

    @Override
    public Logger getLogger() {
        return logger;
    }
}
