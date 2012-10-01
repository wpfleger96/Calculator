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

    @Test
    public void testInfixToPostfix() {

	String infix = "1 + 2 + 3";
	String expected = "[1, 2, +, 3, +]";
      
	String postfix[] = ReversePolishNotation.infixToPostfix(infix.split(" "));

	String result = Arrays.asList(postfix).toString();

	System.out.println(result);

	assertTrue(result.equals(expected));

    } // testInfixToPosrfix

} // ReversePolishNotationTest

