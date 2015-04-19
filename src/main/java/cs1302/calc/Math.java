package cs1302.calc;

/** 
 * Provides an interface for different mathematical operations over
 * non-negative integers.
 *
 * @author Michael E. Cotterell
 */
public interface Math {

    /**
     * Returns the result of incrementing the operand.
     *
     * <p>
     * The default implementation does not need to be overrident in
     * implementing classes.
     *
     * @param n  the operand
     * @return the result of n + 1
     */
    public default int inc(int n) {
        return n + 1;
    } // inc

    /** 
     * Returns the successor of the operand.
     *
     * <p>
     * The default implementation does not need to be overrident in
     * implementing classes.
     * 
     * @param n  the operand
     * @return the result of n + 1
     * @deprecated replaced by {@link #inc(int)}
     */
    @Deprecated
    public default int succ(int n) {
        return inc(n);
    } // succ

    /**
     * Returns the result of deccrementing the operand.
     *
     * <p>
     * The default implementation does not need to be overrident in
     * implementing classes.
     * 
     * @param n  the operand
     * @return the result of <code>n - 1</code>
     */
    public default int dec(int n) {
        if (n <= 0) return 0;
        return n - 1;
    } // dec

    /** 
     * Returns the predecessor of the operand.
     * 
     * @param n  the operand
     * @return the result of n - 1
     * @deprecated replaced by {@link #dec(int)}
     */
    @Deprecated
    public default int pred(int n) {
        return dec(n);
    } // pred

    /**
     * Returns the result of the binary addition operation 
     * <code>lhs + rhs</code>.
     *
     * <p>
     * The default implementation does not need to be overrident in
     * implementing classes.
     * 
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */
    public int add(int lhs, int rhs);

    /**
     * Returns the result of the binary subtraction operation
     * <code>lhs - rhs</code>.
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */
    public int sub(int lhs, int rhs);

    /**
     * Returns the result of the binary multiplication operation
     * <code>lhs * rhs</code>.
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */
    public int  mul(int lhs, int rhs);

    /**
     * Returns the result of the binary division operation 
     * <code>lhs / rhs</code>. This method should throw a 
     * <code>ArithmeticException</code> if the second operand is equal to zero.
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     * @throws ArithmeticException  when <code>rhs == 0</code>
     */
    public int div(int lhs, int rhs) throws ArithmeticException;

    /**
     * Returns the result of the unary factorial operation <code>num !</code>. 
     *
     * @param num  the operand
     * @return the result of the operation
     */
    public int fac(int num);

    /**
     * Returns the result of the binary exponentiation operation 
     * <code>lhs ^ rhs</code>. Please note that this is not equivalent to the
     * <code>^</code> operator in Java, which represents the bitwise 
     * exclusive-or. 
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */
    public int pow(int lhs, int rhs);

    /**
     * Returns the result of the binary left-shift operation {@code lhs << rhs}. 
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */
    public int lshift(int lhs, int rhs);

    /**
     * Returns the result of the binary right-shift operation {@code lhs >> rhs}. 
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */
    public int rshift(int lhs, int rhs);

} // Math

