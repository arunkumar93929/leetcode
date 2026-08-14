class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return help(nums, goal)-help(nums, goal-1);
    }
    int help(int[] nums, int goal){
        if(goal<0) return 0;
        int left=0;
        int sum=0;
        int maxlen=0;

        for(int right=0;right<nums.length;right++){
            sum+= nums[right];

            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            maxlen+=(right-left+1);

        }
        return maxlen;
    }
}