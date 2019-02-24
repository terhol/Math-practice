package se.terhol.mathpractice;

import java.util.Random;

/**
 * Class for math operation addition - generates two numbers and correct result. Result of this operation cannot be more than 100.
 *
 * @author Tereza Holm
 */
public class Addition implements MathProblem {
    private int x;
    private int y;
    private int result;

    public Addition() {
        do {
            this.x = new Random().nextInt(MAX_NUMBER + 1);
            this.y = new Random().nextInt(MAX_NUMBER + 1);
        }
        while (this.x + this.y > MAX_NUMBER);

        this.result = this.x + this.y;
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

