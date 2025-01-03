package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures.OverallFeatures;
import org.slf4j.Logger;

public class VeritasOverallFeatures extends OverallFeatures {
    public VeritasOverallFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Veritas-specific overall features");
        logger.info("======== VERITAS OVERALL Features Creation has been completed. ========");
    }
}
