class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<int[]> min = new PriorityQueue<>(Comparator.comparingDouble(a -> (double) a[0]/a[1]));
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                min.offer(new int[]{arr[i], arr[j]});
            }
        }
        for (int i = 0; i < k-1; i++) {
            min.poll();
        }
        return min.poll();
    }
}