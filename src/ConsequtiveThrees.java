/*Design a function that takes a list of integers as input. The function should
return True if the list contains two consecutive threes (3 next to a 3) anywhere
within the list. Otherwise, it should return False. For example, the function
should return True for [1, 3, 3] and False for [1, 3, 1, 3].*/


import java.util.Scanner;

class ConsequtiveThrees {

    // Function to check if the list contains two consecutive threes
    static boolean hasConsecutiveThrees(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the elements of the list separated by spaces or commas (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Split the input by spaces or commas
            String[] elements = input.split("[,\\s]+");
            int[] nums = new int[elements.length];

            try {
                for (int i = 0; i < elements.length; i++) {
                    nums[i] = Integer.parseInt(elements[i]);
                }

                // Check for consecutive threes and print the result
                if (hasConsecutiveThrees(nums)) {
                    System.out.println("The list contains two consecutive threes.");
                } else {
                    System.out.println("The list does not contain two consecutive threes.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid list of integers.");
            }
        }

        scanner.close();
    }
}
