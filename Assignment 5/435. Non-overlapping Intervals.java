//TC:O(n logn)
//SC:O(1)

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1], b[1]));
        int n = intervals.length;
        int c = 0;
        int end = intervals[0][1];
        for(int i=1; i<n; i++) {
            if (end <= intervals[i][0]) {
                end = intervals[i][1];
            }
            else c++;
        }
        return c;
    }
}

// Example 1:
// Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
// Output: 1
// Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.

// Example 2:
// Input: intervals = [[1,2],[1,2],[1,2]]
// Output: 2
// Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.

// Example 3:
// Input: intervals = [[1,2],[2,3]]
// Output: 0
// Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
