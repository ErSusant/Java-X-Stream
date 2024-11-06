public class MissingNumber {

    public static void main(String[] args) {
        int n = 100;
        int missingNumber = 55; // Example: 45 is missing

        // Calculate the expected sum of numbers from 1 to 100
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum with the missing number removed
        int actualSum = expectedSum - missingNumber;

        // The difference is the missing number
        int calculatedMissing = expectedSum - actualSum;

        System.out.println("The missing number is: " + calculatedMissing);
    }
}