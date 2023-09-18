class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{' || check.empty())
                check.push(c);
            else if(c==')')
            {
                if(check.peek()=='(')
                    check.pop();
                else
                    return false;
            }
            else if(c==']')
            {
                if(check.peek()=='[')
                    check.pop();
                else
                    return false;
            }
            else
            {
                if(check.peek()=='{')
                    check.pop();
                else
                    return false;
            }
        }
        return check.empty();
    }
}