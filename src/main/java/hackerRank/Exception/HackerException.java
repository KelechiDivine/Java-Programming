package hackerRank.Exception;

public class HackerException extends Exception{

    public HackerException() {
        super();
    }

    public HackerException(String message) {
        super(message);
    }

    public HackerException(String message, Throwable cause) {
        super(message, cause);
    }

    public HackerException(Throwable cause) {
        super(cause);
    }

    protected HackerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
