class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = points[i][0];
        Arrays.sort(arr);
        int max = 0;
        for(int i=1; i<n; i++)
            max = Math.max(arr[i]-arr[i-1], max);
        return max;
    }
}