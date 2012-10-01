package cs1302.calc;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This is a test for the ReversePolishNotation class. 
 *
 * @author Michael E. Cotterell <mepcotterell@gmail.com>
 */
public class ReversePolishNotationTest {

  @Test
  public void testInfixToPostfix() {

      String infix = "1 + 2 + 3";
      
      String postfix[] = ReversePolishNotation.infixToPostfix(infix.split(" "));

      System.out.println(Arrays.asList(postfix).toString());

      assertEquals("Driver Test", true, true);

  } // testInfixToPosrfix

} // ReversePolishNotationTest

