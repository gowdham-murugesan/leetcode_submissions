class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String word : words)
        {
            int[] charFreq = new int[26];
            for (char c : word.toCharArray())
                charFreq[c - 'a']++;
            for (int i = 0; i < 26; i++)
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++)
            for (int j = 0; j < minFreq[i]; j++)
                ans.add((char)(i + 'a') + "");
        return ans;
    }
}