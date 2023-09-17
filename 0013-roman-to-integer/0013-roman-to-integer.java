class Solution {
    int val = 0;
    public void test(char c, char d)
    {
        switch(c)
        {
            case 'I':
                if(d=='V'||d=='X')
                    val -=1;
                else
                    val += 1;
                break;
            case 'V':
                val += 5;
                break;
            case 'X':
                if(d=='L'||d=='C')
                    val -=10;
                else
                    val += 10;
                break;
            case 'L':
                val += 50;
                break;
            case 'C':
                if(d=='D'||d=='M')
                    val -=100;
                else
                    val += 100;
                break;
            case 'D':
                val += 500;
                break;
            case 'M':
                val += 1000;
                break;
        }
    }
    public int romanToInt(String s) {
        test(s.charAt(s.length()-1), ' ');
        for(int i=s.length()-2; i>=0; i--)
        {
            test(s.charAt(i), s.charAt(i+1));
        }
        return val;
    }
}