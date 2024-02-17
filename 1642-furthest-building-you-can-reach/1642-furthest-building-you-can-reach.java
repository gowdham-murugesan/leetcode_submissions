class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int t;
        for(int i=1; i<heights.length; i++)
        {
            t = heights[i]-heights[i-1];
            if(t>0)
            {
                bricks -= t;
                pq.add(t);
                if(bricks<0)
                {
                    bricks += pq.poll();
                    if(ladders>0)
                        ladders--;
                    else
                        return i-1;
                }
            }
        }
        return heights.length-1;
    }
}