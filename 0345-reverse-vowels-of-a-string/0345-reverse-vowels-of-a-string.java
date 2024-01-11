class Solution {
    public String reverseVowels(String s) {
        int st = 0, e = s.length()-1;
        char[] arr = s.toCharArray();
        String v = "aeiouAEIOU";
        while(st<e)
        {
            while(st<e && v.indexOf(arr[st])==-1)
                st++;
            while(st<e && v.indexOf(arr[e])==-1)
                e--;

            char t = arr[st];
            arr[st] = arr[e];
            arr[e] = t;

            st++;
            e--;
        }
        return new String(arr);
    }
}