/*Design a function that takes a string or sequence of characters as input and
        returns the character that appears most frequently.
Eg 11189 => '1'
hello => l*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Frequency {
    static String findMostFrequentChars(String input) {

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        StringBuilder mostFrequentChars = new StringBuilder();

        for (int count : charCountMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                if (!mostFrequentChars.isEmpty()) {
                    mostFrequentChars.append(", ");
                }
                mostFrequentChars.append(entry.getKey());
            }
        }
        if (maxCount == 1 && charCountMap.size() == input.length()) {
            return "No single most frequent character.";
        }

        return mostFrequentChars.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string or sequence of characters (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String result = findMostFrequentChars(input);
            System.out.println(result);
        }

        scanner.close();
    }
}
