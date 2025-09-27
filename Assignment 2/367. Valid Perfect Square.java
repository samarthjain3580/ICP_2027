// TC : O ms
// SC : 40 MB

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 1, right = num;
        while (left <= right) {
            long mid = (left + right) / 2;
            long square = mid * mid;

            if (square == num) return true;
            if (square < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}

// Example 1:
// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

// Example 2:
// Input: num = 14
// Output: false
// Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
