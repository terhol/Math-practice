package se.terhol.mathpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Tereza Holm
 */
class MultiplicationTest {
    private static final int WANTED_TEST_RUNS = 1000;

    @Test
    void getX() {
        for (int i = 0; i <= WANTED_TEST_RUNS; i++) {
            int x = new Multiplication().getX();

            assertTrue(x <= 10);
            assertTrue(x >= 0);
        }
    }

    @Test
    void getY() {
        for (int i = 0; i <= WANTED_TEST_RUNS; i++) {
            int y = new Multiplication().getY();

            assertTrue(y <= 10);
            assertTrue(y >= 0);
        }
    }

    @Test
    void getResult() {
        for (int i = 0; i <= WANTED_TEST_RUNS; i++) {
            MathProblem multiplication = new Multiplication();

            int x = multiplication.getX();
            int y = multiplication.getY();
            int result = multiplication.getResult();

            assertTrue(result <= 100);
            assertTrue(result >= 0);
            assertEquals(result, x * y);
        }
    }
}