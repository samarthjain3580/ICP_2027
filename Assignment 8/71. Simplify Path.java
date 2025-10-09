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
