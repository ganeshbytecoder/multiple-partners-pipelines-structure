package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.BaseKiscoreIngestion;

public abstract class CBDetailsIngestion extends BaseKiscoreIngestion {
    
    @Override
    public void preprocessData() {
        logger.info("Preprocessing CB Details data");
        cleanData();
        standardizeFormat();
    }

    @Override
    public void loadData() {
        logger.info("Loading CB Details data");
        loadCBProfile();
        loadBranchDetails();
    }

    // Abstract methods for partner-specific implementations
    protected abstract void cleanData();
    protected abstract void standardizeFormat();
    protected abstract void loadCBProfile();
    protected abstract void loadBranchDetails();
}
