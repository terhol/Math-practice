package se.terhol.mathpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Tereza Holm
 */
class DivisionTest {
    private static final int WANTED_TEST_RUNS = 10000;

    @Test
    void getX() {
        for (int i = 0; i <= WANTED_TEST_RUNS; i++) {
            int x = new Division().getX();

            assertTrue(x <= 100);
            assertTrue(x >= 0);
        }
    }

    @Test
    void getY() {
        for (int i = 0; i <= WANTED_TEST_RUNS; i++) {
            int y = new Division().getY();

            assertTrue(y <= 10);
            assertTrue(y >= 0);
        }
    }

    @Test
    void getResult() {
        for (int i = 0; i <= WANTED_TEST_RUNS; i++) {
            MathProblem division = new Division();

            int x = division.getX();
            int y = division.getY();
            int result = division.getResult();

            assertTrue(result <= 10);
            assertTrue(result >= 0);
            assertTrue(result != 1);
            assertEquals(result, x / y);
        }
    }
}