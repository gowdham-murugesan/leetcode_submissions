class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String num = "123456789";
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<num.length(); i++)
        {
            for(int j=i+1; j<num.length(); j++)
            {
                int t = Integer.parseInt(num.substring(i, j+1));
                if(t>=low && t<=high)
                    ans.add(t);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}