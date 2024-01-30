class Solution {
    public int searchInsert(int[] n, int target) {
        int a=0;
        for(int i=0;i<n.length;i++){
            if(target<=n[i]){
                return i;
            }
        }
        return n.length;
        
    }
}