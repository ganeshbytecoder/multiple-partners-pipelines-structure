package com.bytecoder.kaleidopipelines.kiscore.featurecreation.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures.RetailFeatures;
import org.slf4j.Logger;

public class VeritasRetailFeatures extends RetailFeatures {
    public VeritasRetailFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Veritas-specific retail features");
        logger.info("======== VERITAS RETAIL Features Creation has been completed. ========");
    }
}
