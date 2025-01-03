package com.bytecoder.kaleidopipelines.kiview.pipeline.partners.sonata;

import com.bytecoder.kaleidopipelines.kiview.pipeline.base.DefaultIngestionPipeline;

public class SonataIngestionPipeline extends DefaultIngestionPipeline {
    
    @Override
    protected void validateData() {
        logger.info("Validating Sonata data for one-time load");
        // Add Sonata-specific validation logic
    }

    @Override
    protected void transformData() {
        logger.info("Transforming Sonata data for one-time load");
        // Add Sonata-specific transformation logic
    }

    @Override
    protected void loadData() {
        logger.info("Loading Sonata data for one-time load");
        // Add Sonata-specific loading logic
    }

    @Override
    protected void validateIncrementalData() {
        logger.info("Validating Sonata data for incremental load");
        // Add Sonata-specific incremental validation logic
    }

    @Override
    protected void transformIncrementalData() {
        logger.info("Transforming Sonata data for incremental load");
        // Add Sonata-specific incremental transformation logic
    }

    @Override
    protected void loadIncrementalData() {
        logger.info("Loading Sonata data for incremental load");
        // Add Sonata-specific incremental loading logic
    }
}
