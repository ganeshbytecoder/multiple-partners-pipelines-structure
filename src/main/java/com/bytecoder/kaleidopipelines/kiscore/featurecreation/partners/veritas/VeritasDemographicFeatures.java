package com.bytecoder.kaleidopipelines.kiscore.featurecreation.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures.DemographicFeatures;
import org.slf4j.Logger;

public class VeritasDemographicFeatures extends DemographicFeatures {
    public VeritasDemographicFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Veritas-specific demographic features");
        logger.info("======== VERITAS DEMOGRAPHIC Features Creation has been completed. ========");
    }
}
