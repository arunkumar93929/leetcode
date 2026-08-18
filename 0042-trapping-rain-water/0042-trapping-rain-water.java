class Solution {
    public int trap(int[] nums) {
        int n= nums.length;
        int left=0;
        int right=n-1;

        int maxleft=0;
        int maxright=0;

        int ans=0;
        
        while(left<= right){
            if(nums[left]<nums[right]){
                if(nums[left]>= maxleft){
                    maxleft= nums[left];
                }else{
                    ans+= maxleft-nums[left]; 
                }
            left++;
            }else{
                if(nums[right]>= maxright){
                    maxright=nums[right];
                }else{
                    ans+=maxright-nums[right];
                }
                right--;
            }
        }
        return ans;
    }
}