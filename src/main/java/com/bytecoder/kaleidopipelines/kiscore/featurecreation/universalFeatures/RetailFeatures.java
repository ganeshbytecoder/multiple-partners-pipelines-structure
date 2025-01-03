package com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.command.FeatureCommand;
import org.slf4j.Logger;

public class RetailFeatures implements FeatureCommand {
    protected final Logger logger;

    public RetailFeatures(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void createFeatures() {
        logger.info("======== RETAIL Features Creation has been started. ========");
        logger.info("======== RETAIL Features Creation has been completed. ========");
    }
}
