/*Design a function that reverses the digits of an integer. For example, 50
should become 5 and -12 should become -21.*/

import java.util.Scanner;

class Reversedigits {
    // Function to reverse the digits of an integer
    static int reverseDigits(int num) {
        int rev_num = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }

        return sign * rev_num;
    }

    // Driver method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number to reverse (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                // Reverse the number and print the result
                System.out.println("Reverse of the number is " + reverseDigits(num));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        scanner.close();
    }
}
