// - Time complexity: O(n)
// - Space complexity: O(n)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for(char ch: s.toCharArray()) {
            while (set.contains(ch)) {
                max = Math.max(max, set.size());
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
        }
        return Math.max(max, set.size());
    }
}

// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

// Example 2:
// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

// Example 3:
// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
