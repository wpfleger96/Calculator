package cs1302.calc;

/** 
 * Provides an interface for different mathematical operations
 */
public interface Math {

    /**
     * Returns the result of incrementing the operand
     *
     * @param n the operand
     * @return the result of n + 1
     */
    public int inc(int n);

    /**
     * Returns the result of deccrementing the operand
     *
     * @param n the operand
     * @return the result of n - 1
     */
    public int dec(int n);

    /**
     * Returns the result of the binary addition operation "lhs + rhs"
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int add(int lhs, int rhs);

    /**
     * Returns the result of the binary subtraction operation "lhs - rhs"
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int sub(int lhs, int rhs);

    /**
     * Returns the result of the binary multiplication operation "lhs * rhs"
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int  mul(int lhs, int rhs);

    /**
     * Returns the result of the binary division operation "lhs / rhs". This
     * method should throw an ArithmeticException if the second operand is equal
     * to zero.
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int div(int lhs, int rhs) throws ArithmeticException;

    /**
     * Returns the result of the unary factorial operation "num !". 
     *
     * @param num the operand
     * @return the result of the operation
     */
    public int fac(int num);

    /**
     * Returns the result of the binary exponentiation operation "lhs ^ rhs". 
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int pow(int lhs, int rhs);

    /**
     * Returns the result of the binary left-shift operation "lhs << rhs". 
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int lshift(int lhs, int rhs);

    /**
     * Returns the result of the binary right-shift operation "lhs >> rhs". 
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int rshift(int lhs, int rhs);


} // Math

