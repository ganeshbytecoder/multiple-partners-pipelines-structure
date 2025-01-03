package com.bytecoder.kaleidopipelines.kiscore.featurecreation.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures.OtherFeatures;
import org.slf4j.Logger;

public class VeritasOtherFeatures extends OtherFeatures {
    public VeritasOtherFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Veritas-specific other features");
        logger.info("======== VERITAS OTHER Features Creation has been completed. ========");
    }
}
