package com.bytecoder.kaleidopipelines.kiscore.featurecreation.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.FeatureCreation;
import com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures.FeatureType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VeritasFeatureCreation implements FeatureCreation {
    private final Logger logger = LoggerFactory.getLogger(VeritasFeatureCreation.class);

    @Override
    public void createFeatures(FeatureType featureType) {
        switch (featureType) {
            case MFI:
                new VeritasMFIFeatures(logger).createFeatures();
                break;
            case RETAIL:
                new VeritasRetailFeatures(logger).createFeatures();
                break;
            case OVERALL:
                new VeritasOverallFeatures(logger).createFeatures();
                break;
            case DEMOGRAPHIC:
                new VeritasDemographicFeatures(logger).createFeatures();
                break;
            case OTHER:
                new VeritasOtherFeatures(logger).createFeatures();
                break;
            case REPAYMENT:
                new VeritasRepaymentFeatures(logger).createFeatures();
                break;
            default:
                logger.warn("Unsupported feature type: {}", featureType);
        }
    }

    @Override
    public String getPartnerName() {
        return "VERITAS";
    }

    @Override
    public Logger getLogger() {
        return logger;
    }
}
