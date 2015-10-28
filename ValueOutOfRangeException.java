public class ValueOutOfRangeException extends Exception {
    public ValueOutOfRangeException() {
        super();
    }

    public ValueOutOfRangeException(String msg) {
        super(msg);
    }

    public ValueOutOfRangeException(Throwable cause) {
        super(cause);
    }

    public ValueOutOfRangeException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
