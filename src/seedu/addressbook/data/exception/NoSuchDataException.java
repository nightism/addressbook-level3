package seedu.addressbook.data.exception;

/**
 * Signals an error caused by no existing data in the list
 */
public abstract class NoSuchDataException extends IllegalValueException{
	public NoSuchDataException(String message) {
        super(message);
    }
}
