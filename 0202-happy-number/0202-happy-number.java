class Solution {
    public boolean isHappy(int n) {
        int sum, d;
        Set<Integer> vals = new HashSet<>();
        while(n!=1 && !vals.contains(n))
        {
            vals.add(n);
            sum = 0;
            while(n>0)
            {
                d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return n==1;
    }
}