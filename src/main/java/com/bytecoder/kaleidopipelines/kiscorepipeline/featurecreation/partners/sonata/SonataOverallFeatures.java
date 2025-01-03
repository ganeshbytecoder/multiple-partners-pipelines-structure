package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures.OverallFeatures;
import org.slf4j.Logger;

public class SonataOverallFeatures extends OverallFeatures {
    public SonataOverallFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Sonata-specific overall features");
        logger.info("======== SONATA OVERALL Features Creation has been completed. ========");
    }
}
