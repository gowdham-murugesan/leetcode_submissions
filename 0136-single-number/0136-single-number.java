class Solution {
    public int singleNumber(int[] n) {
        int count=0;
        int c=0;
        for(int i=0;i<n.length;i++){
            count = 0;
            for(int j=0;j<n.length;j++){
                if(n[i]==n[j]){
                    count++;
                }
            }
            if(count==1){
                 return n[i];
            }
        } 
        return 0;   
    }
}