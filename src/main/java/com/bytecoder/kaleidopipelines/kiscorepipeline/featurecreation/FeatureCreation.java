package com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation;

import com.bytecoder.kaleidopipelines.kiscorepipeline.featurecreation.universalFeatures.FeatureType;
import org.slf4j.Logger;

public interface FeatureCreation {
    void createFeatures(FeatureType featureType);

    String getPartnerName();

    Logger getLogger();
}
