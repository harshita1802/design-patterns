package DesignPatterns.CreationalDesignPatterns.Builder.StudentBuilder;

public class NameInvalidException extends RuntimeException {
    public NameInvalidException() {
    }

    public NameInvalidException(String message) {
        super(message);
    }

    public NameInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameInvalidException(Throwable cause) {
        super(cause);
    }

    public NameInvalidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
