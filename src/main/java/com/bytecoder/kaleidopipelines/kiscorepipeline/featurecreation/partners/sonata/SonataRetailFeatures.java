package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures.RetailFeatures;
import org.slf4j.Logger;

public class SonataRetailFeatures extends RetailFeatures {
    public SonataRetailFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Sonata-specific retail features");
        logger.info("======== SONATA RETAIL Features Creation has been completed. ========");
    }
}
