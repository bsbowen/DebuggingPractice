package org.example;
public class DebuggingPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate and print the average
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);

        // Introduce exceptions for testing
        introduceNullPointerException();
        introduceArrayIndexOutOfBoundsException();

        // Introduce a logic error for testing
        introduceLogicError();
    }

    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        // Check if the array is null or empty to prevent IllegalArgumentException
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        // Sum up all elements in the array
        int sum = 0;
        for (int number : numbers) {
            System.out.println("Adding: " + number); // Debugging statement
            sum += number;
        }
        System.out.println("Sum: " + sum); // Debugging statement

        // Calculate and return the average
        return (double) sum / numbers.length;
    }

    // Method to introduce a NullPointerException
    public static void introduceNullPointerException() {
        int[] numbers = null; // Set the array to null

        // Check if the array is null to prevent NullPointerException
        if (numbers != null) {
            System.out.println(numbers.length); // This line will only execute if the array is not null
        } else {
            System.out.println("Array is null"); // Inform that the array is null
        }
    }

    // Method to introduce an ArrayIndexOutOfBoundsException
    public static void introduceArrayIndexOutOfBoundsException() {
        int[] numbers = {1, 2, 3, 4, 5}; // Initialize an array with 5 elements

        // Check if the index is within the valid range to prevent ArrayIndexOutOfBoundsException
        if (10 < numbers.length) {
            System.out.println(numbers[10]); // This line will only execute if the index is within bounds
        } else {
            System.out.println("Index out of bounds"); // Inform that the index is out of bounds
        }
    }

    // Method to introduce a logic error and demonstrate fixing it
    public static void introduceLogicError() {
        int[] numbers = {1, 2, 3, 4, 5};

        // Introduce a logic error: Incorrect calculation of average using only the first two elements
        double incorrectAverage = (double) (numbers[0] + numbers[1]) / numbers.length;
        System.out.println("Incorrect Average: " + incorrectAverage);

        // Correct logic: Use the calculateAverage method to get the correct average
        double correctAverage = calculateAverage(numbers);
        System.out.println("Correct Average: " + correctAverage);
    }
}