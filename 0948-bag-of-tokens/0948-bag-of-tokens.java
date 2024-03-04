class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0, temp = 0, i = 0, j = tokens.length-1;
        while(i<=j)
        {
            if(power >= tokens[i])
            {
                power -= tokens[i++];
                score = Math.max(score, ++temp);
            }
            else if(temp > 0)
            {
                temp--;
                power += tokens[j--];
            }
            else
            {
                break;
            }
        }
        return score;
    }
}