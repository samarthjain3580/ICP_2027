TC: O(n)
SC: O(n)

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i: asteroids) {
            if (stack.isEmpty()) stack.push(i);
            else {
                if (i > 0) stack.push(i);
                else {
                    boolean flag = true;
                    while (!stack.isEmpty() && stack.peek() > 0) {
                        if (Math.abs(i) > stack.peek()) stack.pop();
                        else {
                            if (Math.abs(i) == stack.peek()) stack.pop();
                            flag = false;
                            break;
                        } 
                    }
                    if (flag) stack.push(i);
                }
            }
        }

        int[] ans = new int[stack.size()];

        for(int i=stack.size()-1; i>=0; i--) {
            ans[i] = stack.pop(); 
        }
        
        return ans;
    }
}

// Example 1:
// Input: asteroids = [5,10,-5]
// Output: [5,10]
// Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

// Example 2:
// Input: asteroids = [8,-8]
// Output: []
// Explanation: The 8 and -8 collide exploding each other.

// Example 3:
// Input: asteroids = [10,2,-5]
// Output: [10]
// Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
