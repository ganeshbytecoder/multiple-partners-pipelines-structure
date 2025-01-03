package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types.CBMFILoanIngestion;

public class SonataCBMFILoanIngestion extends CBMFILoanIngestion {


    @Override
    protected void cleanData() {
        logger.info("Cleaning Sonata MFI loan data");
        // Implement Sonata-specific data cleaning
    }

    @Override
    protected void standardizeFormat() {
        logger.info("Standardizing Sonata MFI loan data format");
        // Implement Sonata-specific format standardization
    }



    @Override
    protected void loadLoanDetails() {
        logger.info("Loading Sonata MFI loan details to database");
        // Implement Sonata-specific MFI loan data loading
    }

    @Override
    protected void loadGroupInfo() {
        logger.info("Loading Sonata group information to database");
        // Implement Sonata-specific group data loading
    }

}
