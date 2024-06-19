//Write a recursive function to calculate the factorial of a number

import java.util.Scanner;

class Factorial {
    // Method to find factorial of given number
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number to calculate its factorial (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                // Calculate the factorial and print the result
                System.out.println("Factorial of " + num + " is " + factorial(num));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        scanner.close();
    }
}
