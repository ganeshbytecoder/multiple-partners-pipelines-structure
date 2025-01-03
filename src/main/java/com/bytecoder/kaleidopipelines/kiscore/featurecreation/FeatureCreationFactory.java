package com.bytecoder.kaleidopipelines.kiscore.featurecreation;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.partners.sonata.SonataFeatureCreation;
import com.bytecoder.kaleidopipelines.kiscore.featurecreation.partners.veritas.VeritasFeatureCreation;
import com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures.UniversalFeatureCreation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FeatureCreationFactory {
    private static final Logger logger = LoggerFactory.getLogger(FeatureCreationFactory.class);

    public static FeatureCreation createFeatureCreation(PartnerType partnerType) {
        if (partnerType == null) {
            return new UniversalFeatureCreation();
        }

        return switch (partnerType) {
            case SONATA -> new SonataFeatureCreation();
            case VERITAS -> new VeritasFeatureCreation();
            default -> {
                logger.info("No specific implementation found for partner {}, using universal features", partnerType);
                yield new UniversalFeatureCreation();
            }
        };
    }
}
