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

    public static final Math impl = new BasicMath();

    public static final String[][] examples = {
	{"1 < 2", "1 2 <", "4"},
	{"2 > 1", "2 1 >", "1"}, 
	{"1 + 2", "1 2 +", "3"},
	{"1 - 2", "1 2 -", "0"},
	{"2 - 1", "2 1 -", "1"},
	{"1 * 2", "1 2 *", "2"},
	{"1 / 2", "1 2 /", "0"},
	{"2 / 1", "2 1 /", "2"},
	{"12 / 3", "12 3 /", "4"},
	{"1 ^ 2", "1 2 ^", "1"},
	{"2 ^ 3", "2 3 ^", "8"},
	{"222 + 32 * 5 + 1", "222 32 5 * + 1 +", "383"},
	{"4 !", "4 !", "24"},
	{"4 - 2 ! / 3 + 7 * 2 ^ 3", "4 2 ! 3 / - 7 2 3 ^ * +", "60"},
	{"45 / 10", "45 10 /", "4"},
	{"9 < 2", "9 2 <", "36"},
	{"2 * 3 ! ^ 5 + 9", "2 3 ! 5 ^ * 9 +", "15561"}
    };
     
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

	for (String[] example: examples) {
	    String message = String.format("\"%s\" --> \"%s\" (expected \"%s\")", example[0], getPostfix(example[0]), example[1]);
	    assertTrue(message, example[1].equals(getPostfix(example[0])));
	} // for

    } // testInfixToPosrfix

    @Test
    public void testEvaluate() {

	for (String[] example: examples) {

	    String   expression = example[0];
	    String[] infix      = expression.split(" ");
	    String[] postfix    = ReversePolishNotation.infixToPostfix(infix);
	    int      expected   = -2;
	    int      result     = -1;

	    try {
		expected = Integer.parseInt(example[2]);
	    } catch (Exception e) { }

	    try {
		result = ReversePolishNotation.evaluate(impl, postfix);
	    } catch (Exception e) { }

	    String message = String.format("\"%s\" --> %d (expected %d)", expression, result, expected);
	    assertTrue(message, result == expected);

	} // for	

    } // testEvaluate

} // ReversePolishNotationTest

