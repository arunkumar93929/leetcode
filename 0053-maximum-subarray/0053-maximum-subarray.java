class Solution {
    public int maxSubArray(int[] nums) {
        int curr= 0;
        int maxx= Integer.MIN_VALUE;

        for(int i=0;i< nums.length;i++){
            curr=Math.max(nums[i], curr+nums[i]);
            maxx= Math.max(curr, maxx);
        }
        return maxx;
        
    }
}