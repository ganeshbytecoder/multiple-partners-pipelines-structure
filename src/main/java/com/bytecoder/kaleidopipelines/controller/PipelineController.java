package com.bytecoder.kaleidopipelines.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pipeline")
public class PipelineController {
    private static final Logger logger = LoggerFactory.getLogger(PipelineController.class);

    @PostMapping("/execute")
    public ResponseEntity<String> executePipeline(@RequestBody List<String> commands) {
        try {
            logger.info("Received commands: {}", commands);
            
            if (commands == null || commands.isEmpty()) {
                logger.error("Commands list is empty");
                return ResponseEntity.badRequest().body("Commands list cannot be empty");
            }

            String pipelineType = commands.get(0);
            logger.info("Creating pipeline of type: {}", pipelineType);
            
            Pipeline pipeline = KaleidoPipelineFactory.createPipeline(pipelineType);
            logger.info("Executing pipeline with commands");
            pipeline.execute(commands);
            
            logger.info("Pipeline execution completed successfully");
            return ResponseEntity.ok(String.format("%s pipeline executed successfully", pipelineType));
        } catch (IllegalArgumentException e) {
            logger.error("Bad request error: {}", e.getMessage(), e);
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            logger.error("Internal server error: {}", e.getMessage(), e);
            return ResponseEntity.internalServerError()
                    .body("Error executing pipeline: " + e.getMessage());
        }
    }
}
