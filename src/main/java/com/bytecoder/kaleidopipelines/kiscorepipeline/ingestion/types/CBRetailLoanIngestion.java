package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.BaseKiscoreIngestion;

public abstract class CBRetailLoanIngestion extends BaseKiscoreIngestion {
    
    @Override
    public void preprocessData() {
        logger.info("Preprocessing CB Retail Loan data");
        cleanData();
        standardizeFormat();
    }

    @Override
    public void loadData() {
        logger.info("Loading CB Retail Loan data");
        loadLoanDetails();
        loadCustomerInfo();
    }

    // Abstract methods for partner-specific implementations
    protected abstract void cleanData();
    protected abstract void standardizeFormat();
    protected abstract void loadLoanDetails();
    protected abstract void loadCustomerInfo();
}
