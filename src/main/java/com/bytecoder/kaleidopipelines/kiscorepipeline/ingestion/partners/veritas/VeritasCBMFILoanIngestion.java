package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.veritas;

import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.types.CBMFILoanIngestion;

public class VeritasCBMFILoanIngestion extends CBMFILoanIngestion {


    @Override
    protected void cleanData() {
        logger.info("Cleaning Veritas MFI loan data");
        // Implement Veritas-specific data cleaning
    }

    @Override
    protected void standardizeFormat() {
        logger.info("Standardizing Veritas MFI loan data format");
        // Implement Veritas-specific format standardization
    }

    @Override
    protected void loadLoanDetails() {
        logger.info("Loading Veritas MFI loan details to database");
        // Implement Veritas-specific MFI loan data loading
    }

    @Override
    protected void loadGroupInfo() {
        logger.info("Loading Veritas group information to database");
        // Implement Veritas-specific group data loading
    }

}
