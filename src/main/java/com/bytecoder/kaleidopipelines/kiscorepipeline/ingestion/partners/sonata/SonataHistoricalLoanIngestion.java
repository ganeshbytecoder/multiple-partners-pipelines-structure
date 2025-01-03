package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.sonata;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types.HistoricalLoanIngestion;

public class SonataHistoricalLoanIngestion extends HistoricalLoanIngestion {


    @Override
    protected void cleanData() {
        logger.info("Cleaning Sonata historical loan data");
        // Implement Sonata-specific data cleaning
    }

    @Override
    protected void standardizeFormat() {
        logger.info("Standardizing Sonata historical loan format");
        // Implement Sonata-specific format standardization
    }

  

    @Override
    protected void loadLoanDetails() {
        logger.info("Loading Sonata historical loan details to database");
        // Implement Sonata-specific loan data loading
    }

    @Override
    protected void loadRepaymentHistory() {
        logger.info("Loading Sonata repayment history to database");
        // Implement Sonata-specific repayment history loading
    }

}
