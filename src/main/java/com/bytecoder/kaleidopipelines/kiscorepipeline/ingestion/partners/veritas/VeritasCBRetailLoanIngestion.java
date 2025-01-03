package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types.CBRetailLoanIngestion;

public class VeritasCBRetailLoanIngestion extends CBRetailLoanIngestion {


    @Override
    protected void cleanData() {
        logger.info("Cleaning Veritas retail loan data");
        // Implement Veritas-specific data cleaning
    }

    @Override
    protected void standardizeFormat() {
        logger.info("Standardizing Veritas retail loan data format");
        // Implement Veritas-specific format standardization
    }


    @Override
    protected void loadLoanDetails() {
        logger.info("Loading Veritas loan details to database");
        // Implement Veritas-specific loan data loading
    }

    @Override
    protected void loadCustomerInfo() {
        logger.info("Loading Veritas customer information to database");
        // Implement Veritas-specific customer data loading
    }
}
