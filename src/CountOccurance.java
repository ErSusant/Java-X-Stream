class CountOccurrence {
    public static void main(String[] args) {
        String str = "HELLO WORLD";

        int countH = 0, countE = 0, countL = 0, countO = 0, countW = 0, countR = 0, countD = 0;
        char[] characters = str.toCharArray();

        for (char c : characters) {
            if (c == 'H') {
                countH++;
            } else if (c == 'E') {
                countE++;
            } else if (c == 'L') {
                countL++;
            } else if (c == 'O') {
                countO++;
            } else if (c == 'W') {
                countW++;
            } else if (c == 'R') {
                countR++;
            } else if (c == 'D') {
                countD++;
            }
        }

        // Construct the output string
        String result = "Count of H: " + countH + "\n" +
                        "Count of E: " + countE + "\n" +
                        "Count of L: " + countL + "\n" +
                        "Count of O: " + countO + "\n" +
                        "Count of W: " + countW + "\n" +
                        "Count of R: " + countR + "\n" +
                        "Count of D: " + countD;

        // Print the result using a single System.out.println
        System.out.println(result);
    }
}
