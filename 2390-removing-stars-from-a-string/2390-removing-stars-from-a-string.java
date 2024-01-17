class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char t = s.charAt(i);
            if(t=='*')
                st.pop();
            else
                st.push(t);
        }
        String ans = "";
        while(!st.isEmpty())
            ans = st.pop() + ans;
        return ans;
    }
}