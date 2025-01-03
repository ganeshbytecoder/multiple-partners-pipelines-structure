package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.factory;

import com.bytecoder.kaleidopipelines.kiscorepipeline.common.KiscoreIngestionType;
import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.KiscoreIngestion;
import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.sonata.*;
import com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion.partners.veritas.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KiscoreIngestionFactory {
    private static final Logger logger = LoggerFactory.getLogger(KiscoreIngestionFactory.class);

    public static KiscoreIngestion createIngestion(String partnerType, KiscoreIngestionType ingestionType) {
        logger.info("Creating ingestion pipeline for partner: {} and type: {}", partnerType, ingestionType);
        
        switch (partnerType.toUpperCase()) {
            case "SONATA":
                return createSonataIngestion(ingestionType);
            case "VERITAS":
                return createVeritasIngestion(ingestionType);
            default:
                throw new IllegalArgumentException("Unknown partner type: " + partnerType);
        }
    }

    private static KiscoreIngestion createSonataIngestion(KiscoreIngestionType ingestionType) {
        switch (ingestionType) {
            case CB_RETAIL_LOAN:
                return new SonataCBRetailLoanIngestion();
            case CB_MFI_LOAN:
                return new SonataCBMFILoanIngestion();
            case CB_DETAILS:
                return new SonataCBDetailsIngestion();
            case HISTORICAL_LOAN:
                return new SonataHistoricalLoanIngestion();
            default:
                throw new IllegalArgumentException("Unknown ingestion type for Sonata: " + ingestionType);
        }
    }

    private static KiscoreIngestion createVeritasIngestion(KiscoreIngestionType ingestionType) {
        switch (ingestionType) {
            case CB_RETAIL_LOAN:
                return new VeritasCBRetailLoanIngestion();
            case CB_MFI_LOAN:
                return new VeritasCBMFILoanIngestion();
            case CB_DETAILS:
                return new VeritasCBDetailsIngestion();
            case HISTORICAL_LOAN:
                return new VeritasHistoricalLoanIngestion();
            default:
                throw new IllegalArgumentException("Unknown ingestion type for Veritas: " + ingestionType);
        }
    }
}
