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
