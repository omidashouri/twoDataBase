package ir.omidashouri.twodatabase.utils;

/**
 * @author Najmeh Abbasi Tehrani
 */
public enum DatePattern {
    YEAR_DATE_PATTERN("yyyy", Boolean.TRUE, Boolean.FALSE),
    SMALLEST_DATE_PATTERN("yyMMdd", Boolean.TRUE, Boolean.FALSE),
    MINIMIZED_DATE_PATTERN("yyyyMMdd", Boolean.TRUE, Boolean.FALSE),
    DATE_PATTERN("yyyy/MM/dd", Boolean.TRUE, Boolean.FALSE),
    DATE_BY_HYPHEN_PATTERN("yyyy-MM-dd", Boolean.TRUE, Boolean.FALSE),
    DATE_TIME_PATTERN("yyyy/MM/dd HH:mm", Boolean.TRUE, Boolean.TRUE),
    DATE_TIME_BY_HYPHEN_PATTERN("yyyy-MM-dd HH:mm", Boolean.TRUE, Boolean.TRUE),
    FULL_DATE_TIME_PATTERN("yyyy/MM/dd HH:mm:ss", Boolean.TRUE, Boolean.TRUE),
    DAY_MONTH_YEAR_TIME_PATTERN("dd/MM/yyyy HH:mm", Boolean.TRUE, Boolean.TRUE),
    FULL_DATE_TIME_BY_HYPHEN_PATTERN("yyyy-MM-dd HH:mm:ss", Boolean.TRUE, Boolean.TRUE),
    FULL_DATE_TIME_STRING_PATTERN("EEE, d MMM yyyy HH:mm:ss", Boolean.TRUE, Boolean.TRUE),
    TIMESTAMP_DATE_TIME_PATTERN("yyyyMMddHHmmss", Boolean.TRUE, Boolean.TRUE),
    TIME_PATTERN("HH:mm", Boolean.FALSE, Boolean.TRUE),
    FULL_TIME_PATTERN("HH:mm:ss", Boolean.FALSE, Boolean.TRUE),
    MINIMIZED_TIME_PATTERN("HHmmss", Boolean.FALSE, Boolean.TRUE),
    ISO_TRANSMISSION_DATE_PATTERN("MMddHHmmss", Boolean.TRUE, Boolean.TRUE),
    ISO_LOCAL_TRANSACTION_DATE_TIME_PATTERN("yyMMddHHmmss", Boolean.TRUE, Boolean.TRUE),
    ISO_CAPTURE_DATE_PATTERN("MMdd", Boolean.TRUE, Boolean.FALSE),
    ISO_SETTLEMENT_DATE_PATTERN("ddMMyy", Boolean.TRUE, Boolean.FALSE),
    ISO_SETTLEMENT_FULL_DATE_PATTERN("ddMMyyyy", Boolean.TRUE, Boolean.FALSE),
    ISO_EXPIRY_DATE_PATTERN("yyMM", Boolean.TRUE, Boolean.FALSE),
    DATE_TIME_SPACE_PATTERN("yyyyMMdd HHmmss", Boolean.TRUE, Boolean.TRUE),
    ISO_8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Boolean.TRUE, Boolean.TRUE),
    FULL_DATE_TIME_BY_HYPHEN_PATTERN_WITH_T_SEPERATOR("yyyy-MM-dd'T'HH:mm:ss", Boolean.TRUE, Boolean.TRUE);

    private final String pattern;
    private final Boolean hasDate;
    private final Boolean hasTime;

    private DatePattern(String pattern, Boolean hasDate, Boolean hasTime) {
        this.pattern = pattern;
        this.hasDate = hasDate;
        this.hasTime = hasTime;
    }

    public Boolean hasDate() {
        return this.hasDate;
    }

    public Boolean hasTime() {
        return this.hasTime;
    }

    public String toString() {
        return this.pattern;
    }
}
