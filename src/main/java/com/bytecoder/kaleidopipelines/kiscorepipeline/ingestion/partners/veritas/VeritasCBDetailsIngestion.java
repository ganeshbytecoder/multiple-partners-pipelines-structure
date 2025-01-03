package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types.CBDetailsIngestion;

public class VeritasCBDetailsIngestion extends CBDetailsIngestion {


    @Override
    protected void cleanData() {
        logger.info("Cleaning Veritas CB details data");
        // Implement Veritas-specific data cleaning
    }

    @Override
    protected void standardizeFormat() {
        logger.info("Standardizing Veritas CB details format");
        // Implement Veritas-specific format standardization
    }


    @Override
    protected void loadCBProfile() {
        logger.info("Loading Veritas CB profile to database");
        // Implement Veritas-specific CB profile loading
    }

    @Override
    protected void loadBranchDetails() {
        logger.info("Loading Veritas branch details to database");
        // Implement Veritas-specific branch loading
    }

}
