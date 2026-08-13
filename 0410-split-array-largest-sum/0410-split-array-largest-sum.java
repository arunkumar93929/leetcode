class Solution {
    public int splitArray(int[] nums, int k) {
        int left= Arrays.stream(nums).max().getAsInt();
        int right=Arrays.stream(nums).sum();

        while(left<= right){
            int mid=left+(right-left)/2;

            int num= split(nums, mid);
            if(num>k){
                left=mid+1;
            }else{
                right=mid-1;

            }
        }
        return left;        
    }
    int split(int[] nums, int k){
        int split=1;
        int arr=0;

        for(int i=0;i<nums.length;i++){
            if(arr+nums[i]<=k){
                arr+=nums[i];
            }else{
                split++;
                arr=nums[i];
            }
        }
        return split;
    }
}