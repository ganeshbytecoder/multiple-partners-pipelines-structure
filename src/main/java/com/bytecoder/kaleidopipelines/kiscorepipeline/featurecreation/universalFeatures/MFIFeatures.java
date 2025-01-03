package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.command.FeatureCommand;
import org.slf4j.Logger;

public class MFIFeatures implements FeatureCommand {
    protected final Logger logger;

    public MFIFeatures(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void createFeatures() {
        logger.info("======== MFI Features Creation has been started. ========");
        logger.info("======== MFI Features Creation has been completed. ========");
    }
}
