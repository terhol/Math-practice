package se.terhol.mathpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Tereza Holm
 */
class AdditionTest {
    private static final int WANTED_TEST_RUNS = 100000;

    @Test
    void getX() {
        for (int i = 0; i <= WANTED_TEST_RUNS; i++) {
            int x = new Addition().getX();

            assertTrue(x <= 100);
            assertTrue(x >= 0);
        }
    }

    @Test
    void getY() {
        for (int i = 0; i <= WANTED_TEST_RUNS; i++) {
            int y = new Addition().getY();

            assertTrue(y <= 100);
            assertTrue(y >= 0);
        }
    }

    @Test
    void getResult() {
        for (int i = 0; i <= WANTED_TEST_RUNS; i++) {
            MathProblem addition = new Addition();

            int x = addition.getX();
            int y = addition.getY();
            int result = addition.getResult();

            assertTrue(result <= 100);
            assertTrue(result >= 0);
            assertEquals(result, x + y);
        }
    }
}