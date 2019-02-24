package se.terhol.mathpractice;

import java.util.Scanner;

/**
 * Class for communicating with user. Lets user choose the operation and number of operations, generates correct math problems and counts rate of success.
 *
 * @author Tereza Holm
 */
public class UserInterface {
    private static final int NO_RESULT = -1;
    Scanner keyboard = new Scanner(System.in);
    MathProblem operation;
    OperationType operationType;
    int mathProblem;
    double numOfProblems;
    double successfulProblems = 0;

    /**
     * Lets user choose math operation, number of problems, then generates math problems and gives rate of success.
     */
    public void practiceMath() {
        this.mathProblem = this.chooseOperation();
        this.setOperationType(mathProblem);

        do {
            this.numOfProblems = setNumOfProblems();
        }
        while (numOfProblems <= 0);
        this.generateMathProblems(numOfProblems, operationType);

        System.out.println(String.format("You had %.2f%% correct answers.", successfulProblems / numOfProblems * 100));
    }

    /**
     * Lets user choose math operation.
     *
     * @return number for math operation.
     */
    public int chooseOperation() {
        System.out.println("Please write which operation you want to practice today.");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        int result = NO_RESULT;

        while (result == NO_RESULT) {
            try {
                result = Integer.parseInt(keyboard.next());
                if (result < 1 || result > 4) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("You have to enter a number from 1 to 4.");
                result = NO_RESULT;
            }
        }

        return result;
    }

    /**
     * Lets user choose number of math problems.
     *
     * @return number for math operation.
     */
    public int setNumOfProblems() {
        System.out.println("How many math problems you want to solve today?");

        while (!keyboard.hasNextInt()) {
            System.out.println("You need to write a number.");

            keyboard.next();
        }

        return keyboard.nextInt();
    }

    /**
     * Generates new instance of OperationType, chosen by user.
     *
     * @param mathProblem operation type chosen by user
     */
    private void setOperationType(int mathProblem) {
        switch (mathProblem) {
            case 1:
                this.operationType = OperationType.ADDITION;
                break;
            case 2:
                this.operationType = OperationType.SUBTRACTION;
                break;
            case 3:
                this.operationType = OperationType.MULTIPLICATION;
                break;
            case 4:
                this.operationType = OperationType.DIVISION;
                break;
        }
    }

    /**
     * Generates math problems. If correct, raises int successfulProblems. If not correct, gives user correct answer.
     *
     * @param numOfProblems number of problems to generate
     * @param operationType operation type chosen by user
     */
    private void generateMathProblems(double numOfProblems, OperationType operationType) {
        for (int i = 0; i < numOfProblems; i++) {
            this.operation = operationType.generateMathProblem();

            System.out.println(String.format("%d %s %d = ", operation.getX(), operationType.getMark(), operation.getY()));

            while (!keyboard.hasNextInt()) {
                System.out.println("You need to type a number.");
                keyboard.next();
            }

            int userResult = keyboard.nextInt();

            if (userResult == operation.getResult()) {
                successfulProblems++;
                System.out.println("Correct");
            } else {
                System.out.println(String.format("Wrong - correct answer is %d.", operation.getResult()));
            }
        }
    }
}
