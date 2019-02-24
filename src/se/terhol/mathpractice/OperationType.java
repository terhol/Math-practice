package se.terhol.mathpractice;

/**
 * Operation types, each operation type contains logical mark.
 *
 * @author Tereza Holm
 */
public enum OperationType {
    ADDITION("+"), SUBTRACTION("-"), MULTIPLICATION("*"), DIVISION("/");
    private String mark;

    OperationType(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return this.mark;
    }

    /**
     * Generates one of four math operations based on choice of user.
     *
     * @return mathProblem chosen by user.
     */
    public MathProblem generateMathProblem() {
        MathProblem mathProblem = null;

        switch (this) {
            case ADDITION:
                mathProblem = new Addition();
                break;
            case SUBTRACTION:
                mathProblem = new Subtraction();
                break;
            case MULTIPLICATION:
                mathProblem = new Multiplication();
                break;
            case DIVISION:
                mathProblem = new Division();
        }

        return mathProblem;
    }
}
