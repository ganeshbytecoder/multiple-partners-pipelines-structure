package com.bytecoder.kaleidopipelines.controller;

import java.util.List;

public interface Pipeline {
    /**
     * Execute the pipeline with the given commands.
     * @param commands List of commands to execute in sequence
     */
    void execute(List<String> commands);


}
