//TC:O(n)
//SC:O(1)

class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int window = 0;
        int ans = 0;
        for(int right = 0; right<s.length(); right++) {
            count[s.charAt(right)-'A']++; 
            window = Math.max(window, count[s.charAt(right) - 'A']);
            while (k < right-left+1-window) {
                count[s.charAt(left)-'A']--; 
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }   
        return ans;
    }
}

// Example 1:
// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.

// Example 2:
// Input: s = "AABABBA", k = 1
// Output: 4
// Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
// The substring "BBBB" has the longest repeating letters, which is 4.
// There may exists other ways to achieve this answer too.
