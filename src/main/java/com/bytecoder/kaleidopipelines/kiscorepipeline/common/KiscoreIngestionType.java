package com.bytecoder.kaleidopipelines.kiscorepipeline.common;

public enum KiscoreIngestionType {
    CB_RETAIL_LOAN("cb_retail"),
    CB_MFI_LOAN("cb_mfi"),
    CB_DETAILS("cb_details"),
    HISTORICAL_LOAN("historical");

    private final String code;

    KiscoreIngestionType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static KiscoreIngestionType fromCode(String code) {
        for (KiscoreIngestionType type : values()) {
            if (type.getCode().equalsIgnoreCase(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown ingestion type code: " + code);
    }
}
