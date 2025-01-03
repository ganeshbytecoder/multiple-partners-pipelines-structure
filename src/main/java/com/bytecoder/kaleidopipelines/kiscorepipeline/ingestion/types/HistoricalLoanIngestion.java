package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.BaseKiscoreIngestion;

public abstract class HistoricalLoanIngestion extends BaseKiscoreIngestion {
    
    @Override
    public void preprocessData() {
        logger.info("Preprocessing Historical Loan data");
        cleanData();
        standardizeFormat();
    }

    @Override
    public void loadData() {
        logger.info("Loading Historical Loan data");
        loadLoanDetails();
        loadRepaymentHistory();
    }

    // Abstract methods for partner-specific implementations
    protected abstract void cleanData();
    protected abstract void standardizeFormat();
    protected abstract void loadLoanDetails();
    protected abstract void loadRepaymentHistory();
}
