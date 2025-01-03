package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseKiscoreIngestion implements KiscoreIngestion {
    protected final Logger logger;

    protected BaseKiscoreIngestion() {
        this.logger = LoggerFactory.getLogger(getClass());
    }

    @Override
    public void ingestData() {
        logger.info("Starting data ingestion process");
        try {
            preprocessData();
            loadData();
            logger.info("Data ingestion completed successfully");
        } catch (Exception e) {
            logger.error("Error during data ingestion: {}", e.getMessage(), e);
            throw new RuntimeException("Ingestion failed", e);
        }
    }

}
