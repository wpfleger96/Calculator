package cs1302.calc;

import java.util.Arrays;

/**
 * Checked exception thrown when attempting to evaluate a malformed postfix
 * expression.
 *
 * @author Michael E. Cotterell
 */
public class MalformedPostfixException extends Exception {

    public MalformedPostfixException(String[] postfix) {
        super(String.format("malformed: %s", Arrays.toString(postfix)));
    } // MalformedPostfixException
    
} // MalformedPostfixException

