package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.BaseKiscoreIngestion;

public abstract class CBMFILoanIngestion extends BaseKiscoreIngestion {
    
    @Override
    public void preprocessData() {
        logger.info("Preprocessing CB MFI Loan data");
        cleanData();
        standardizeFormat();
    }

    @Override
    public void loadData() {
        logger.info("Loading CB MFI Loan data");
        loadLoanDetails();
        loadGroupInfo();
    }

    // Abstract methods for partner-specific implementations
    protected abstract void cleanData();
    protected abstract void standardizeFormat();
    protected abstract void loadLoanDetails();
    protected abstract void loadGroupInfo();
}
