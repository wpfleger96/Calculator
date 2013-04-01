package cs1302.calc;

/** 
 * Provides an interface for different mathematical operations
 */
public interface Math {

    /**
     * Returns the result of the binary addition operation "lhs + rhs"
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int add(double lhs, double rhs);

    /**
     * Returns the result of the binary subtraction operation "lhs - rhs"
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int subtract(double lhs, double rhs);

    /**
     * Returns the result of the binary multiplication operation "lhs * rhs"
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int  multiply(double lhs, double rhs);

    /**
     * Returns the result of the binary division operation "lhs / rhs". This
     * method should throw an ArithmeticException if the second operand is equal
     * to zero.
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public int divide(double lhs, double rhs) throws ArithmeticException;

    /**
     * Returns the result of the unary factorial operation "num !". This method
     * should throw a DomainException if the operand cannot be converted into an
     * integer.
     *
     * @param num the operand
     * @return the result of the operation
     */
    public int factorial(double num) throws DomainException;

    /**
     * Returns the result of the binary exponentiation operation "lhs ^ rhs". 
     * This method should throw a DomainException if the implementation requires
     * that one or more of the parameters be integers.
     *
     * @param lhs the first operand
     * @param rhs the second operand
     * @return the result of the operation
     */
    public inte pow(double lhs, double rhs) throws DomainException;

} // Math

