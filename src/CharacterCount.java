public class CharacterCount {

    public static void main(String[] args) {
        // Step 1: Initialize the input string to count characters in
        String input = "abbcccc";

        // Step 2: Convert the input string into a character array
        // This allows us to iterate over each character in the string
        char[] charArray = input.toCharArray();

        // Step 3: Initialize counters for each character (a, b, and c) to zero
        int countA = 0, countB = 0, countC = 0;

        // Step 4: Loop through each character in the charArray
        for (char ch : charArray) {
            // Step 5: Check if the character is 'a', and if so, increment countA
            if (ch == 'a') {
                countA++;
            }
            // Step 6: Check if the character is 'b', and if so, increment countB
            else if (ch == 'b') {
                countB++;
            }
            // Step 7: Check if the character is 'c', and if so, increment countC
            else if (ch == 'c') {
                countC++;
            }
        }

        // Step 8: Print out the count of each character in the specified format
        System.out.println("a=" + countA + ", b=" + countB + ", c=" + countC);
    }
}
