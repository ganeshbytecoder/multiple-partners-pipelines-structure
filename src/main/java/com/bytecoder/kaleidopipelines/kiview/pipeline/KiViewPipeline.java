package com.bytecoder.kaleidopipelines.kiview.pipeline;

import com.bytecoder.kaleidopipelines.controller.Pipeline;
import java.util.List;

public class KiViewPipeline implements Pipeline {
    @Override
    public void execute(List<String> commands) {
        System.out.println("Executing KiView Pipeline");
        // Add your KiView specific pipeline logic here
    }

}
