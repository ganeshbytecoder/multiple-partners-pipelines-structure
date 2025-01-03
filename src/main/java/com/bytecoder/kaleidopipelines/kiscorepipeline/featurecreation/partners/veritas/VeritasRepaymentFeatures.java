package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures.RepaymentFeatures;
import org.slf4j.Logger;

public class VeritasRepaymentFeatures extends RepaymentFeatures {
    public VeritasRepaymentFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Veritas-specific repayment features");
        logger.info("======== VERITAS REPAYMENT Features Creation has been completed. ========");
    }
}
