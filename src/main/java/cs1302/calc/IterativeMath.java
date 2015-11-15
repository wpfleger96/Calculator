package cs1302.calc;

/* Implement the Math interface using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 *IterativeMath.java implements Math.java and overrides each method using iterative algorithms
 * @author Will Pfleger, Jonny Do
 */
public class IterativeMath implements Math {
    /**
       Returns the incremeneted value of n
       @param n the operand
       @return the value of n+1
     */
    public int inc(int n) {
        return n+1;
    } // inc
    /**
       Returns the decremeneted value of n
       @param n the operand
       @return the value of n-1
     */
    public int dec(int n) {
        return n-1;
    } // dec
    /**
       Returns the sum of lhs and rhs
       @param lhs, rhs the operands
       @return the value of lhs+rhs
     */
    public int add(int lhs, int rhs) {
	int sum = lhs;
	while(rhs>0){
	    sum=inc(sum);
	    rhs=dec(rhs);
	}//while
	return sum;
    } // add
    /**
       Returns the difference of lhs and rhs
       @param lhs, rhs the operands
       @return the value of lhs-rhs
     */
    public int sub(int lhs, int rhs) {
	int difference=lhs;
	while(rhs>0){
	    difference=dec(difference);
	    rhs=dec(rhs);
	}//while
	return difference;
  } // sub
    /**
       Returns the product of lhs and rhs
       @param lhs, rhs the operands
       @return the value of lhs*rhs
     */
    public int mul(int lhs, int rhs) {
        int product = 0;
	if(rhs==0)return 0;
	while(rhs>0){
	    product=add(product,lhs);
	    rhs=dec(rhs);
	}//while
	return product;
	    
    } // mul
    /**
       Returns the quotient of lhs and rhs
       @param lhs, rhs the operands
       @return the value of lhs/rhs
     */
    public int div(int lhs, int rhs) {
        if(lhs<rhs){
	    int temp=rhs;
	    rhs=lhs;
	    lhs=temp;
	}
	int quotient=0;
	while(lhs>rhs){
	    quotient=inc(quotient);
	    lhs=sub(lhs,rhs);
	}//while
	return quotient;
    } // div
    /**
       Returns the value of n factorial
       @param n the operand
       @return the value of n!
     */
    public int fac(int n) {
        int result=n;
	while(n>1){
	    n=dec(n);
	    result=mul(result,n);
	}//while
	return result;
    } // fac
    /**
       Returns the value of lhs to the power of rhs 
       @param lhs, rhs the operands
       @return the value of lhs^rhs (exponentiaton)
     */
    public int pow(int lhs, int rhs) {
	if(rhs==0)return 1;
	int result=lhs;
	while(rhs>1){
	    result=mul(result,lhs);
	    rhs=dec(rhs);
	}//while
	return result;
   } // pow
    /**
       Returns the value of lhs bitwise shifted to the left by rhs
       @param lhs, rhs the operands
       @return the value of lhs*(2^rhs) (in binary)
     */
    public int lshift(int lhs, int rhs) {
        return mul(lhs, pow(2,rhs));
    } // lshift
    /**
       Returns the value of lhs bitwise shifted to the right by rhs
       @param lhs, rhs the operands
       @return the value of lhs/(2^rhs) (in binary)
     */
    public int rshift(int lhs, int rhs) {
        return div(lhs, pow(2,rhs));
    } // rshift

} // IterativeMath

