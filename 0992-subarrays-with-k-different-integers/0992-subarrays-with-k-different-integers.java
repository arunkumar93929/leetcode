class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return help(nums, k)-help(nums, k-1);
    }
    int help(int[] nums, int k){
        Map<Integer, Integer> mp = new HashMap<>();
        int left=0;
        int count =0;

        for(int right=0;right<nums.length; right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            if(mp.get(nums[right])==1){
                k--;
            }
            while(k<0){
                mp.put(nums[left],mp.get(nums[left])-1);
                if(mp.get(nums[left])==0){
                    k++;
                }
                left++;
            }
            count+=(right-left+1);

        }
        return count;
    }
}