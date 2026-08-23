class Solution {
    public int majorityElement(int[] nums) {
        
        int count=1;
        int maj=nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]==maj){
                count++;
            }else{
                count--;
                if(count==0){
                    maj=nums[i];
                    count=1;
                }
            }
        }
        count=0;
        for(int x: nums){
            if(x==maj){
                count++;
            }
        }
        return (count > nums.length / 2) ? maj : -1;        
    }
}