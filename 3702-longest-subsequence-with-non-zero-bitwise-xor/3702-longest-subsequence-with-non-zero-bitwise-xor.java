class Solution {
    public int longestSubsequence(int[] nums) {
       
        int count=0;
        int xr=0;
        boolean all= true;
        for(int i: nums){
            xr^=i;
            if(i!=0) all=false;

        }
    if(all) return 0;
    return xr!=0 ? nums.length: nums.length-1;
        
    }
}