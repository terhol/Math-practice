package se.terhol.mathpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Tereza Holm
 */
class OperationTypeTest {
    @Test
    void getMark() {
        assertEquals(OperationType.ADDITION.getMark(), "+");
        assertEquals(OperationType.SUBTRACTION.getMark(), "-");
        assertEquals(OperationType.MULTIPLICATION.getMark(), "*");
        assertEquals(OperationType.DIVISION.getMark(), "/");
    }

    @Test
    void generateMathProblem() {
        assertTrue(OperationType.ADDITION.generateMathProblem() instanceof Addition);
        assertTrue(OperationType.SUBTRACTION.generateMathProblem() instanceof Subtraction);
        assertTrue(OperationType.MULTIPLICATION.generateMathProblem() instanceof Multiplication);
        assertTrue(OperationType.DIVISION.generateMathProblem() instanceof Division);
    }
}