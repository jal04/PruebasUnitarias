package services.exceptions;

public class NotValidePrescriptionException extends Exception {
    public NotValidePrescriptionException (String msg) {
        super(msg);
    }
}
