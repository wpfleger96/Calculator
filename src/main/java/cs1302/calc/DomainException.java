package cs1302.calc;

/**
 * Represents a domain mismatch in an involving an operand in a mathematical
 * operation.
 */
public class DomainException extends Exception {

    public DomainException() {
	this("A domain exception has occurred.");
    } // DomainException

    public DomainException(String message) {
	super(message);
    } // DomainException

} // DomainException
