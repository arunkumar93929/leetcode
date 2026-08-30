class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0;
        int max=0;
        int n= nums.length;
        for(int i=0;i< n;i++){
            if(nums[i]< nums[min]) min=i;
            if(nums[i]> nums[max])max=i;
        }
        
        int left= Math.min(max, min);
        int right= Math.max(max, min);

        int front= right+1;
        int back = n-left;
        int both= (left+1)+(n-right);

        return Math.min(front, Math.min(back, both));
        
    }
}