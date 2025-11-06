// TC:O(n)
// SC:O(n)

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();

        for(char c: s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().ch == c) {
                stack.peek().count++;
                if (stack.peek().count == k) {
                    stack.pop();
                }
            }
            else {
                stack.push(new Pair(c, 1));
            }
        }

        StringBuilder ans = new StringBuilder();
        for(Pair p : stack) {
            ans.append(String.valueOf(p.ch).repeat(p.count));
        }

        return ans.toString();
    }

    class Pair{
        char ch;
        int count;
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    } 
}

// Example 1:
// Input: s = "abcd", k = 2
// Output: "abcd"
// Explanation: There's nothing to delete.

// Example 2:
// Input: s = "deeedbbcccbdaa", k = 3
// Output: "aa"
// Explanation: 
// First delete "eee" and "ccc", get "ddbbbdaa"
// Then delete "bbb", get "dddaa"
// Finally delete "ddd", get "aa"

// Example 3:
// Input: s = "pbbcggttciiippooaais", k = 2
// Output: "ps"
