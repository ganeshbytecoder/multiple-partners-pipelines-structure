package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.FeatureCreation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UniversalFeatureCreation implements FeatureCreation {
    private final Logger logger = LoggerFactory.getLogger(UniversalFeatureCreation.class);

    @Override
    public void createFeatures(FeatureType featureType) {
        switch (featureType) {
            case MFI:
                new MFIFeatures(logger).createFeatures();
                break;
            case RETAIL:
                new RetailFeatures(logger).createFeatures();
                break;
            case OVERALL:
                new OverallFeatures(logger).createFeatures();
                break;
            case DEMOGRAPHIC:
                new DemographicFeatures(logger).createFeatures();
                break;
            case OTHER:
                new OtherFeatures(logger).createFeatures();
                break;
            case REPAYMENT:
                new RepaymentFeatures(logger).createFeatures();
                break;
            default:
                logger.warn("Unsupported feature type: {}", featureType);
        }
    }

    @Override
    public String getPartnerName() {
        return "UNIVERSAL";
    }

    @Override
    public Logger getLogger() {
        return logger;
    }
}
