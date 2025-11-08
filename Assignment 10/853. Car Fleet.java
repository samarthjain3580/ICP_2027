// TC O(nlogn)
// SC O(n)

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];
        for(int i=0; i<n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double) (target-position[i])/speed[i];
        }  

        Arrays.sort(cars, (a,b) ->Double.compare(b[0],a[0]));

        int count = 0;
        double prev = 0;

        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            if (time > prev) {  
                count++;
                prev = time;
            }
            
        }
        return count;
    }
}

// Example 1:
// Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
// Output: 3
// Explanation:
// The cars starting at 10 (speed 2) and 8 (speed 4) become a fleet, meeting each other at 12. The fleet forms at target.
// The car starting at 0 (speed 1) does not catch up to any other car, so it is a fleet by itself.
// The cars starting at 5 (speed 1) and 3 (speed 3) become a fleet, meeting each other at 6. The fleet moves at speed 1 until it reaches target.

// Example 2:
// Input: target = 10, position = [3], speed = [3]
// Output: 1
// Explanation:
// There is only one car, hence there is only one fleet.
