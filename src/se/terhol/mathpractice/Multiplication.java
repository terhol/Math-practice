package se.terhol.mathpractice;

import java.util.Random;

/**
 * Class for math operation multiplication - generates two numbers and correct result. Result of this operation cannot be more than 10.
 *
 * @author Tereza Holm
 */
public class Multiplication implements MathProblem {
    private int x;
    private int y;
    private int result;

    public Multiplication() {
        this.x = new Random().nextInt(MAX_PARTIAL_NUMBER + 1);
        this.y = new Random().nextInt(MAX_PARTIAL_NUMBER + 1);

        this.result = this.x * this.y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getResult() {
        return result;
    }
}

