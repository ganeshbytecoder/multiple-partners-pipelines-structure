package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types.HistoricalLoanIngestion;

public class VeritasHistoricalLoanIngestion extends HistoricalLoanIngestion {

  

    @Override
    protected void cleanData() {
        logger.info("Cleaning Veritas historical loan data");
        // Implement Veritas-specific data cleaning
    }

    @Override
    protected void standardizeFormat() {
        logger.info("Standardizing Veritas historical loan format");
        // Implement Veritas-specific format standardization
    }


    @Override
    protected void loadLoanDetails() {
        logger.info("Loading Veritas historical loan details to database");
        // Implement Veritas-specific loan data loading
    }

    @Override
    protected void loadRepaymentHistory() {
        logger.info("Loading Veritas repayment history to database");
        // Implement Veritas-specific repayment history loading
    }
}
