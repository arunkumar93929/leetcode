class Solution {
    public int countPartitions(int[] nums) {
        int total= 0;
        for(int x:nums){
            total+=x;
        }
        int cnt=0;
        int left=0;
        for(int i=0;i<nums.length-1;i++){
             left +=nums[i];
            int right= total-left;

            if((left-right)%2==0){
                cnt++;
            }
        }
        return cnt;
        
    }
}