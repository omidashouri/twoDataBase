package ir.omidashouri.twodatabase.model;




import java.util.Objects;


public enum Status {
    SUCCESS(1L, "SUCCESS"),
    FAILED(0L, "FAILED");

    private final Long code;
    private final String message;

    Status(Long code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Status getStatusByCode(Long code) {
        for (Status status : Status.values()) {
            if (Objects.equals(status.getCode(), code)) {
                return status;
            }
        }
        return null;
    }

    public Long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


    public static Status getStatusByMessage(String message) {
        for (Status status : Status.values()) {
            if (status.getMessage().equalsIgnoreCase(message)) {
                return status;
            }
        }
        return null;
    }



}
