package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures.MFIFeatures;
import org.slf4j.Logger;

public class VeritasMFIFeatures extends MFIFeatures {
    public VeritasMFIFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Veritas-specific MFI features");
        logger.info("======== VERITAS MFI Features Creation has been completed. ========");
    }
}
