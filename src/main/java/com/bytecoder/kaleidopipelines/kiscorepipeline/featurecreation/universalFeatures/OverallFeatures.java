package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.command.FeatureCommand;
import org.slf4j.Logger;

public class OverallFeatures implements FeatureCommand {
    protected final Logger logger;

    public OverallFeatures(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void createFeatures() {
        logger.info("======== OVERALL Features Creation has been started. ========");
        logger.info("======== OVERALL Features Creation has been completed. ========");
    }
}
