package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures.MFIFeatures;
import org.slf4j.Logger;

public class SonataMFIFeatures extends MFIFeatures {
    public SonataMFIFeatures(Logger logger) {
        super(logger);
    }

    @Override
    public void createFeatures() {
        logger.info("Creating Sonata-specific MFI features");
        logger.info("======== SONATA MFI Features Creation has been completed. ========");
    }
}
