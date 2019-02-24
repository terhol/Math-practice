package se.terhol.mathpractice;

import java.util.Random;

/**
 * Class for math operation subtraction - generates two numbers and correct result.
 *
 * @author Tereza Holm
 */
public class Subtraction implements MathProblem {
    private int x;
    private int y;
    private int result;

    public Subtraction() {
        do {
            this.x = new Random().nextInt(MAX_NUMBER + 1);
            this.y = new Random().nextInt(MAX_NUMBER + 1);
        }
        while (this.y > this.x);

        this.result = this.x - this.y;
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