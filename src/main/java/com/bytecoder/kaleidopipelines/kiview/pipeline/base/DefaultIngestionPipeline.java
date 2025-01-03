package com.bytecoder.kaleidopipelines.kiview.pipeline.base;

import com.bytecoder.kaleidopipelines.kiview.pipeline.LoadType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultIngestionPipeline {
    protected final Logger logger;

    public DefaultIngestionPipeline() {
        this.logger = LoggerFactory.getLogger(getClass());
    }

    public void executeOneTimeLoad() {
        logger.info("Executing one-time load ingestion pipeline");
        validateData();
        transformData();
        loadData();
        logger.info("Completed one-time load ingestion");
    }

    public void executeIncrementalLoad() {
        logger.info("Executing incremental load ingestion pipeline");
        validateIncrementalData();
        transformIncrementalData();
        loadIncrementalData();
        logger.info("Completed incremental load ingestion");
    }

    protected void validateData() {
        logger.info("Validating data for one-time load");
    }

    protected void transformData() {
        logger.info("Transforming data for one-time load");
    }

    protected void loadData() {
        logger.info("Loading data for one-time load");
    }

    protected void validateIncrementalData() {
        logger.info("Validating data for incremental load");
    }

    protected void transformIncrementalData() {
        logger.info("Transforming data for incremental load");
    }

    protected void loadIncrementalData() {
        logger.info("Loading data for incremental load");
    }
}
