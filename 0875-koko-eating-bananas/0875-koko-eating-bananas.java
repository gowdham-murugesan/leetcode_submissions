class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0, k = 0;
        for(int i : piles)
            r = Math.max(r, i);
        while(l<=r)
        {
            k = l+(r-l)/2;
            int val = 0;
            for(int i=0; i<piles.length; i++)
                val += Math.ceil(1.0 * piles[i] / k);
            if(val>h)
                l = k+1;
            else
                r = k-1;
        }
        return l;
    }
}