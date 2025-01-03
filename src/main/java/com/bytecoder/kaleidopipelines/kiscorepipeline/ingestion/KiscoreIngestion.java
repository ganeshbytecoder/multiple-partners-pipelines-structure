package com.bytecoder.kaleidopipelines.kiscorepipeline.ingestion;

public interface KiscoreIngestion {
    void ingestData();
    void preprocessData();
    void loadData();
}
