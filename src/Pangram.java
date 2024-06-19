/*Design a function that determines whether a given string is a pangram. A
pangram is a sentence or phrase containing every letter of the alphabet at
least once. Punctuation and case are typically ignored. For example, the
string "The quick brown fox jumps over the lazy dog" is a pangram, while
"Hello, world!" is not.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Pangram{

    static boolean isPangram(String input) {
        input = input.toLowerCase();

        Set<Character> uniqueChars = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                uniqueChars.add(c);
            }
        }
        return uniqueChars.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string to check if it is a pangram (type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (isPangram(input)) {
                System.out.println("The string is a pangram.");
            } else {
                System.out.println("The string is not a pangram.");
            }
        }

        scanner.close();
    }
}
