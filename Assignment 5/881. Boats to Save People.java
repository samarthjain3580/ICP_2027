// TC:O(nlogn)
// SC:O(1)
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); 
        int i = 0, j = people.length - 1;
        int boat = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) i++;
            j--;
            boat++;
        }

        return boat;
    }
}

// Example 1:
// Input: people = [1,2], limit = 3
// Output: 1
// Explanation: 1 boat (1, 2)

// Example 2:
// Input: people = [3,2,2,1], limit = 3
// Output: 3
// Explanation: 3 boats (1, 2), (2) and (3)

// Example 3:
// Input: people = [3,5,3,4], limit = 5
// Output: 4
// Explanation: 4 boats (3), (3), (4), (5)
