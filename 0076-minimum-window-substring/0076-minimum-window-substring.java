class Solution {
    public String minWindow(String s, String t) {
        int arr[] = new int[128];
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();
        String ans = "";
        int minL = Integer.MAX_VALUE;
        int l = 0, r = 0, count = 0;

        for(char c : tarr)
            arr[c]++;

        while(r < s.length())
        {
            if(arr[sarr[r]] > 0)
                count++;
            arr[sarr[r]]--;
            while(count==t.length())
            {
                if(r-l+1 < minL)
                {
                    minL = r-l+1;
                    ans = s.substring(l, r+1);
                }
                if(arr[sarr[l]] >= 0)
                    count--;
                arr[sarr[l]]++;
                l++;
            }
            r++;
        }
        return ans;
    }
}