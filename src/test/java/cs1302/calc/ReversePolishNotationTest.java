package cs1302.calc;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * This is a test for the ReversePolishNotation class. 
 *
 * @author Michael E. Cotterell <mepcotterell@gmail.com>
 */
public class ReversePolishNotationTest {

    /**
     * Returns a String representation of a postfix expression returned by the
     * infixToPostfix method in the ReversePolishNotation class.
     *
     * @param infix a mathematical expression in infix notation
     */
    public String getPostfix(String infix) {
	String postfix[] = ReversePolishNotation.infixToPostfix(infix.split(" "));
	return Arrays.asList(postfix).toString().replaceAll("[,\\[\\]]", "");
    } // getPostfix

    @Test
    public void testInfixToPostfix() {

	String examples[][] = {
	    {"1 + 2", "1 2 +"},
	    {"1 - 2", "1 2 -"},
	    {"1 * 2", "1 2 *"},
	    {"1 / 2", "1 2 /"},
	    {"1 ^ 2", "1 2 ^"},
	    {"4 !", "4 !"},
	    {"4 + 2 ! / 3 - 7 * 2 ^ 3", "4 2 ! 3 / + 7 2 3 ^ * -"}
	};

	String infix = "";
	String expected = "[1, 2, +, 3, +]";

	for (String[] example: examples) {
	    String message = String.format("\"%s\" --> \"%s\" (expected \"%s\")", example[0], getPostfix(example[0]), example[1]);
	    assertTrue(message, example[1].equals(getPostfix(example[0])));
	} // for

    } // testInfixToPosrfix

} // ReversePolishNotationTest

