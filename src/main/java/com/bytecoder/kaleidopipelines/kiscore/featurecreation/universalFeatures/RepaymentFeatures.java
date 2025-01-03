package com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.command.FeatureCommand;
import org.slf4j.Logger;

public class RepaymentFeatures implements FeatureCommand {
    protected final Logger logger;

    public RepaymentFeatures(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void createFeatures() {
        logger.info("======== REPAYMENT Features Creation has been started. ========");
        logger.info("======== REPAYMENT Features Creation has been completed. ========");
    }
}
