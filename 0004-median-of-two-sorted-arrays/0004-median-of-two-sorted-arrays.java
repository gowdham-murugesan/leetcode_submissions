class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int x = 0, y = 0, i = 0, j = 0;
        for(int c = 0; c<=(m+n)/2; c++)
        {
            x = y;
            if(i!=m && j!=n)
            {
                if(nums1[i]<nums2[j])
                    y = nums1[i++];
                else
                    y = nums2[j++];
            }
            else if(i<m)
                y = nums1[i++];
            else if(j<n)
                y = nums2[j++];
        }
        if((m+n)%2==0)
            return (x+y)/2.0;
        else
            return y;
    }
}