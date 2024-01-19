class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int n : asteroids)
        {
            if(n>0)
                s.push(n);
            else
            {
                while(!s.isEmpty() && s.peek()>0 && Math.abs(n)>s.peek())
                    s.pop();
                if(s.isEmpty() || s.peek()<0)
                    s.push(n);
                else if(Math.abs(n)==s.peek())
                    s.pop();
            }
        }
        int ans[] = new int[s.size()];
        for(int i=0; i<s.size(); i++)
            ans[i] = s.get(i);
        return ans;
    }
}