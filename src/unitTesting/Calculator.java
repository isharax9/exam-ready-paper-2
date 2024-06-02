package unitTesting;

public class Calculator {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract one number from another
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide one number by another
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Main method for testing the Calculator class
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Testing add method
        int sum = calculator.add(5, 3);
        System.out.println("5 + 3 = " + sum);

        // Testing subtract method
        int difference = calculator.subtract(5, 3);
        System.out.println("5 - 3 = " + difference);

        // Testing multiply method
        int product = calculator.multiply(5, 3);
        System.out.println("5 * 3 = " + product);

        // Testing divide method
        int quotient = calculator.divide(6, 3);
        System.out.println("6 / 3 = " + quotient);

        // Testing divide method with division by zero
        try {
            calculator.divide(5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
