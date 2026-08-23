class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            rev(nums, 0, n-1);
            return;
        }
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums, i, index);
                break;
            }
        }

        rev(nums,index+1,n-1);
        
    }
    private void swap(int[] nums, int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    private void rev(int[] nums, int left, int right){
        while(left<right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}