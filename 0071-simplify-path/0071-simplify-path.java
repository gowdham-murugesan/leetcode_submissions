class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String ans = "";
        for(String s : path.split("/"))
        {
            if(!st.isEmpty() && s.equals(".."))
                st.pop();
            else if(!s.equals("") && !s.equals(".") && !s.equals(".."))
                st.push(s);
        }
        if(st.isEmpty())
            return "/";
        for(String s : st)
            ans += "/" + s;
        return ans;
    }
}