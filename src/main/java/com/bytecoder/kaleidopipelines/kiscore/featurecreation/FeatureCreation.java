package com.bytecoder.kaleidopipelines.kiscore.featurecreation;

import com.bytecoder.kaleidopipelines.kiscore.featurecreation.universalFeatures.FeatureType;
import org.slf4j.Logger;

public interface FeatureCreation {
    void createFeatures(FeatureType featureType);

    String getPartnerName();

    Logger getLogger();
}
