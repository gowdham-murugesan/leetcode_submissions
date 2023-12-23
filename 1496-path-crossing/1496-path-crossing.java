class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> vis = new HashSet<>();
        vis.add("0,0");

        for(char dir : path.toCharArray())
        {
            if(dir=='E')
                x++;
            else if(dir=='W')
                x--;
            else if(dir=='N')
                y++;
            else
                y--;

            String c = x + "," + y;
            if(vis.contains(c))
                return true;
            vis.add(c);
        }
        return false;
    }
}