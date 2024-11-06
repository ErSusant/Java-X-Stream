class Solution {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply increment it
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Return the array since no further changes are needed
            }

            // If the current digit is 9, set it to 0
            digits[i] = 0;
        }

        // If all digits were 9, we need to create a new array with an additional digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // Set the first digit to 1, the rest will default to 0
        return newNumber;
    }

    public static void main(String[] args) {


        // Test Case 1: Normal Case
        int[] digits1 = {1, 2, 3,9};
        int[] result1 = Solution.plusOne(digits1);
        System.out.print("Result 1: ");
        for (int num : result1) {
            System.out.print(num);
        }
        System.out.println();

        // Test Case 2: Carry Over Case
        int[] digits2 = {1, 9, 9};
        int[] result2 = Solution.plusOne(digits2);
        System.out.print("Result 2: ");
        for (int num : result2) {
            System.out.print(num);
        }
        System.out.println();

        // Test Case 3: All Nines
        int[] digits3 = {9, 9, 9};
        int[] result3 = Solution.plusOne(digits3);
        System.out.print("Result 3: ");
        for (int num : result3) {
            System.out.print(num);
        }
        System.out.println();
    }
}