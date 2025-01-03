package com.bytecoder.kaleidopipelines.controller;

import com.bytecoder.kaleidopipelines.kiscorepipeline.pipeline.KiscorePipeline;
import com.bytecoder.kaleidopipelines.kiviewpipeline.KiViewPipeline;

public class KaleidoPipelineFactory  {
    public static Pipeline createPipeline(String pipelineType) {
        if (pipelineType == null || pipelineType.isEmpty()) {
            throw new IllegalArgumentException("Pipeline type cannot be null or empty");
        }

        switch (pipelineType.toUpperCase()) {
            case "KIVIEW":
                return new KiViewPipeline();
            case "KISCORE":
                return new KiscorePipeline();
            default:
                throw new IllegalArgumentException("Unknown pipeline type: " + pipelineType);
        }
    }
}
