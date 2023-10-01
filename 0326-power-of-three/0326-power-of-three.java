class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=1; i<=n/(i*i); i++)
        {
            if(n == Math.pow(3, i))
                return true;
        }
        return false || n==1;
    }
}