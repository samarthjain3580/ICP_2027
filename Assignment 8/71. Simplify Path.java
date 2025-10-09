// TC: O(n)
// SC: O(n)

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] s = path.split("/");
        for(int i=0; i<s.length; i++) {
            if (s[i].equals("") || s[i].equals(".")) continue;
            else if (s[i].equals("..")) {
                if(!stack.isEmpty()) stack.pop();
            }
            else stack.push(s[i]);
        }

        StringBuilder ans = new StringBuilder();
        for(String str:stack) {
            ans.append("/");
            ans.append(str);
        }

        if (ans.length() == 0) return "/";
        return ans.toString();
    }
}

// Example 1:
// Input: path = "/home/"
// Output: "/home"
// Explanation: The trailing slash should be removed.

// Example 2:
// Input: path = "/home//foo/"
// Output: "/home/foo"
// Explanation: Multiple consecutive slashes are replaced by a single one.

// Example 3:
// Input: path = "/home/user/Documents/../Pictures"
// Output: "/home/user/Pictures"
// Explanation: A double period ".." refers to the directory up a level (the parent directory).

// Example 4:
// Input: path = "/../"
// Output: "/"
// Explanation: Going one level up from the root directory is not possible.

// Example 5:
// Input: path = "/.../a/../b/c/../d/./"
// Output: "/.../b/d"
// Explanation: "..." is a valid name for a directory in this problem.
