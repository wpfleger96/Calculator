package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * RecursiveMath.java implements Math.java and overrides the methods using recursive algorithms
 *
 * @author Will Pfleger, Johnny Do
 */
public class RecursiveMath implements Math {
    /**
       Returns the incremented value of n
       @param n the operand
       @return the value of n+1
    */
    public int inc(int n) {
        return n+1;
    } // inc
    /**
       Returns the decremented value of n
       @param n the operand
       @return the value of n-1
    */
    public int dec(int n) {
	return n-1;
    } // dec
    /**
       Returns the sum of lhs and rhs
       @param lhs, rhs the operands
       @return the value of lhs + rhs
    */
    public int add(int lhs, int rhs) {
        if(rhs==0)return lhs;
	return add(inc(lhs), dec(rhs));
    } // add
    /**
       Returns the difference of lhs and rhs
       @param lhs, rhs the operands
       @return the value of lhs - rhs
    */
    public int sub(int lhs, int rhs) {
        if(rhs==0)return lhs;
	if(rhs>lhs)return 0;
	return sub(dec(lhs), dec(rhs));
    } // sub
    /**
       Returns the product of lhs and rhs
       @param lhs, rhs the operands
       @return the value of lhs * rhs
    */
    public int mul(int lhs, int rhs) {
        if(rhs==0)return 0;
	if(rhs==1)return lhs;
	return add(lhs, mul(lhs, dec(rhs)));
    } // mul
    /**
       Returns the quotient of lhs and rhs
       @param lhs, rhs the operands
       @return the value of lhs * rhs
    */
    public int div(int lhs, int rhs) {
	if(lhs<rhs)return 0;
	if(lhs==rhs)return 1;
	return inc(div(sub(lhs,rhs), rhs));
    } // div
    /**
       Returns the value of n factorial
       @param n the operand
       @return the value of n!
    */
    public int fac(int n) {
	if(n==0)return 1;
        return n*(fac(dec(n)));
    } // fac
    /**
       Returns the value of lhs to the power of rhs
       @param lhs, rhs the operands
       @return the value of lhs^rhs (exponentiation)
    */
    public int pow(int lhs, int rhs) {
	if(rhs==0)return 1;
	return lhs*pow(lhs,dec(rhs));
    } // pow
    /**
       Returns the value of lhs bitwise shifted to the right by rhs
       @param lhs, rhs the operands
       @return the value of lhs * (2^rhs) in binary
    */
    public int lshift(int lhs, int rhs) {
        return mul(lhs,pow(2,rhs));
    } // lshift
    /**
       Returns the value of lhs bitwise shifted to the left by rhs
       @param lhs, rhs the operands
       @return the value of lhs / (2^rhs) in binary
    */
    public int rshift(int lhs, int rhs) {
	return div(lhs,pow(2,rhs));
    } // rshift

} // RecursiveMath


