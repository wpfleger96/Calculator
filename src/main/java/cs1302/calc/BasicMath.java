package cs1302.calc;

/** 
 * Provides a basic implementation of the operations defined in the Math
 * interface. This implementation assumes that the inputs to each method are
 * non-negative integers.
 *
 * @author Michael E. Cotterell 
 */
public class BasicMath implements Math {

    public int add(int lhs, int rhs) {
        return lhs + rhs;
    } // add

    public int sub(int lhs, int rhs) {
        if (lhs - rhs < 0) return 0;
        return lhs - rhs;
    } // sub

    public int mul(int lhs, int rhs) {
        return lhs * rhs;
    } // mul

    public int div(int lhs, int rhs) throws ArithmeticException {
        return lhs / rhs;
    } // div

    public int fac(int num) {
        // THE NARWHAL BACONS!
        int product = 1;              // products start with one
        int n       = ++num;          // increment, like a boss
        while (n --> 2) product *= n; // while n approaches 2, multiply
        return product;               // wait, "-->",  WAT!?
    } // fac

    public int pow(int lhs, int rhs) {
        return (int) java.lang.Math.pow(lhs, rhs);
    } // pow

    public int lshift(int lhs, int rhs) {
        return lhs << rhs;
    } // lshift

    public int rshift(int lhs, int rhs) {
        return lhs >> rhs;
    } // rshift

} // BasicMath

