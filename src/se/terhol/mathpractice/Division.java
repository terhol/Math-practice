package se.terhol.mathpractice;

import java.util.Random;

/**
 * Class for math operation division - generates two numbers and correct result. Result of this operation cannot be more than 10 and cannot be 1.
 *
 * @author Tereza Holm
 */
public class Division implements MathProblem {
    private int x;
    private int y;
    private int result;

    public Division() {
        do {
            this.x = new Random().nextInt(MAX_NUMBER + 1);
            this.y = new Random().nextInt(MAX_PARTIAL_NUMBER) + 1;
        }
        while (x % y != 0 || x == y || x == 0 || x / y > MAX_PARTIAL_NUMBER);

        this.result = this.x / this.y;
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

