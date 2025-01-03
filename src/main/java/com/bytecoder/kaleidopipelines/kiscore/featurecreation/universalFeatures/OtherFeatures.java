package com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.command.FeatureCommand;
import org.slf4j.Logger;

public class OtherFeatures implements FeatureCommand {
    protected final Logger logger;

    public OtherFeatures(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void createFeatures() {
        logger.info("======== OTHER Features Creation has been started. ========");
        logger.info("======== OTHER Features Creation has been completed. ========");
    }
}
