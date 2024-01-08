class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans = 0;
        Arrays.sort(intervals, (a, b) -> a[1]-b[1]);
        int e = intervals[0][1];
        for(int i=1; i<intervals.length; i++)
        {
            if(intervals[i][0]<e)
                ans++;
            else
                e = Math.max(intervals[i][1], e);
        }
        return ans;
    }
}