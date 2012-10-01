package cs1302.calc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ReversePolishNotation {

    private static final Map<String, Integer> precedenceMap;

    static {
	Map<String, Integer> pMap = new HashMap<String, Integer>();
	pMap.put("+", 1);
        pMap.put("-", 1);
        pMap.put("*", 2);
        pMap.put("/", 2);
	pMap.put("!", 3);
	precedenceMap = Collections.unmodifiableMap(pMap);
    } // static

    public String[] infix2postfix(String[] infix) {

	List<String> postfix = new ArrayList<String>();

	Stack<String> operatorStack = new Stack<String>();

	// check the length of the expression
        if (infix.length != 0) {
                
	    for (int i = 0; i < infix.length; i++) {
                        
		// precedence is null for operands
		Integer precedence = precedenceMap.get(infix[i]);

		if (precedence != null) {

		    // then the current token is an operator
		    while (!operatorStack.isEmpty()) {
			String opFromStack = operatorStack.pop();
			if (precedenceMap.get(opFromStack) < precedence) {
			    operatorStack.push(opFromStack);
			    break;
			} else {
			    postfix.add(opFromStack);
			} // if
		    } // while
                                
		    operatorStack.push(infix[i]);
                                
		} else { 
		    // current token is not an operator
		    postfix.add(infix[i]);
		} // if
                        
	    } // for
                
	    // add the remaining operators to the postfix expression
	    while (!operatorStack.isEmpty()) {
		postfix.add(operatorStack.pop());
	    } // while
                
        } // if
        
        return postfix.toArray(new String[postfix.size()]);

    } // infix2postfix

} // ReversePolishNotation