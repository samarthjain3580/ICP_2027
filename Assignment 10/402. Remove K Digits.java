// TC: O(n)
// SC: O(n)

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        if (num.length() == k) return "0"; 
        for (char ch : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        
        // for(char ch : num.toCharArray()) {
        //     if (k == 0 || stack.isEmpty()) {
        //         stack.push(ch);
        //     }
        //     else if (ch>=stack.peek()) {
        //         k--;
        //     }
        //     else if (ch<stack.peek()) {
        //         stack.pop();
        //         stack.push(ch);
        //         k--;
        //     }
        // } 

        // int sum = 0;
        // int i=0;
        // while (!stack.isEmpty()) {
        //     int c = stack.peek() - '0';
        //     sum += c* Math.pow(10, i);
        //     i++;
        //     stack.pop();
        // }
        // return sum+"";   

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}

// Example 1:
// Input: num = "1432219", k = 3
// Output: "1219"
// Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

// Example 2:
// Input: num = "10200", k = 1
// Output: "200"
// Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.

// Example 3:
// Input: num = "10", k = 2
// Output: "0"
// Explanation: Remove all the digits from the number and it is left with nothing which is 0.
