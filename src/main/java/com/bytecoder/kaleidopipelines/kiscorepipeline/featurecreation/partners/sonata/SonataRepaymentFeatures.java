package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures.RepaymentFeatures;
import org.slf4j.Logger;

public class SonataRepaymentFeatures extends RepaymentFeatures {
    public SonataRepaymentFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Sonata-specific repayment features");
        logger.info("======== SONATA REPAYMENT Features Creation has been completed. ========");
    }
}
