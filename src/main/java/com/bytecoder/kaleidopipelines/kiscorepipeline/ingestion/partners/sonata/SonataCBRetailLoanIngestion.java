package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types.CBRetailLoanIngestion;

public class SonataCBRetailLoanIngestion extends CBRetailLoanIngestion {

    @Override
    protected void cleanData() {
        logger.info("Cleaning Sonata retail loan data");
        // Implement Sonata-specific data cleaning
    }

    @Override
    protected void standardizeFormat() {
        logger.info("Standardizing Sonata retail loan data format");
        // Implement Sonata-specific format standardization
    }

    @Override
    protected void loadLoanDetails() {
        logger.info("Loading Sonata loan details to database");
        // Implement Sonata-specific loan data loading
    }

    @Override
    protected void loadCustomerInfo() {
        logger.info("Loading Sonata customer information to database");
        // Implement Sonata-specific customer data loading
    }
}
