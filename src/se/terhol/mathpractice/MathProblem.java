package se.terhol.mathpractice;

/**
 * Interface for all math operations. Generates correct numbers and result.
 *
 * @author Tereza Holm
 */
public interface MathProblem {
    public static final int MAX_NUMBER = 100;
    public static final int MAX_PARTIAL_NUMBER = 10;

    /**
     * Generates first number.
     *
     * @return first number for math operation.
     */
    int getX();

    /**
     * Generates second number.
     *
     * @return second number for math operation.
     */
    int getY();

    /**
     * Generates result of math problem.
     *
     * @return result from int x and y.
     */
    int getResult();
}
