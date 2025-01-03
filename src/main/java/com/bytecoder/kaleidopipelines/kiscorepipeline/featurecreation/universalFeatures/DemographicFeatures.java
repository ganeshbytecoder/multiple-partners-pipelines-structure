package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.command.FeatureCommand;
import org.slf4j.Logger;

public class DemographicFeatures implements FeatureCommand {
    protected final Logger logger;

    public DemographicFeatures(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void createFeatures() {
        logger.info("======== DEMOGRAPHIC Features Creation has been started. ========");
        logger.info("======== DEMOGRAPHIC Features Creation has been completed. ========");
    }
}
