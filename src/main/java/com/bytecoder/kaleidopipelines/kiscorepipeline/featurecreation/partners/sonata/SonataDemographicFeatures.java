package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures.DemographicFeatures;
import org.slf4j.Logger;

public class SonataDemographicFeatures extends DemographicFeatures {
    public SonataDemographicFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Sonata-specific demographic features");
        logger.info("======== SONATA DEMOGRAPHIC Features Creation has been completed. ========");
    }
}
