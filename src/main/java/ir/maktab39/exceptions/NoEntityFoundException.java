package ir.maktab39.exceptions;

public class NoEntityFoundException extends Exception {
    public NoEntityFoundException(Throwable cause) {
        super("No entity found for query", cause);
    }
}
