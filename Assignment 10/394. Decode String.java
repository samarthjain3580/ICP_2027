// TC: O(n+m)
// SC: O(n+m)

// class Solution {
//     public String decodeString(String s) {
//         Stack<String> str_stack = new Stack<>();
//         Stack<Integer> num_stack = new Stack<>();

//         String ans = "";
//         int num = 0;

//         for(char ch: s.toCharArray()) {
//             if (Character.isDigit(ch)) {
//                 num = num*10 + (ch-'0');
//             }
//             else if (ch == '[') {
//                 str_stack.push(ans);
//                 num_stack.push(num);

//                 num = 0; ans = "";
//             }
//             else if (ch == ']') {
//                 int n = num_stack.pop();
//                 String a = str_stack.pop();
//                 ans=a+ans.repeat(n);
//             }
//             else {
//                 ans+=ch;
//             }
//         }
//         return ans;
//     }
// }

// // Example 1:
// // Input: s = "3[a]2[bc]"
// // Output: "aaabcbc"

// // Example 2:
// // Input: s = "3[a2[c]]"
// // Output: "accaccacc"

// // Example 3:
// // Input: s = "2[abc]3[cd]ef"
// // Output: "abcabccdcdcdef"
 
