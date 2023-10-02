class Solution {
    public int lengthOfLastWord(String s) {
        String a[] = s.strip().split(" ");
        return a[a.length-1].length();
    }
}