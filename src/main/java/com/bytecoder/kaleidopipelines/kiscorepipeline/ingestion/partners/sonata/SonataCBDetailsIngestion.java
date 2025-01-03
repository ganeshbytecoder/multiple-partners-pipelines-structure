package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types.CBDetailsIngestion;

public class SonataCBDetailsIngestion extends CBDetailsIngestion {



    @Override
    protected void cleanData() {
        logger.info("Cleaning Sonata CB details data");
        // Implement Sonata-specific data cleaning
    }

    @Override
    protected void standardizeFormat() {
        logger.info("Standardizing Sonata CB details format");
        // Implement Sonata-specific format standardization
    }

    @Override
    protected void loadCBProfile() {
        logger.info("Loading Sonata CB profile to database");
        // Implement Sonata-specific CB profile loading
    }

    @Override
    protected void loadBranchDetails() {
        logger.info("Loading Sonata branch details to database");
        // Implement Sonata-specific branch loading
    }
}
