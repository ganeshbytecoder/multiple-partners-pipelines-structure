package com.bytecoder.kaleidopipelines.kiscore.featurecreation.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures.OtherFeatures;
import org.slf4j.Logger;

public class SonataOtherFeatures extends OtherFeatures {
    public SonataOtherFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Sonata-specific other features");
        logger.info("======== SONATA OTHER Features Creation has been completed. ========");
    }
}
