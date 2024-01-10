public class Solution {
    
    private int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }
    
    public int trap(int[] A) {
        int len = A.length;
        int[] leftmax = new int[len];
        int[] rightmax = new int[len];
        leftmax[0] = 0;
        rightmax[len - 1] = 0;
        int i;
        int vol = 0;
        for(i = 1; i < len; i++) {
            leftmax[i] = (leftmax[i-1] > A[i-1]) ? leftmax[i-1] : A[i-1];
        }
        for(i = len - 2; i >= 0; i--) {
            rightmax[i] = (rightmax[i+1] > A[i+1]) ? rightmax[i+1] : A[i+1];
        }
        for(i = 1; i < len - 1; i++) {
            if (min(leftmax[i], rightmax[i]) > A[i]) 
                vol += (min(leftmax[i], rightmax[i]) - A[i]);
        }
        return vol;
    }
}