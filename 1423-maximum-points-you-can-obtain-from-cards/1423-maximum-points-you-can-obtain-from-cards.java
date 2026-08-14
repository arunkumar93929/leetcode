class Solution {
    public int maxScore(int[] nums, int k) {
        int n=nums.length;
        int total=0;

        for(int i=0;i<k;i++){
            total+=nums[i];
        }

        int maxtotal=total;

        for(int i=0;i<k;i++){
            total-=nums[k-1-i];

            total+=nums[n-1-i];
            maxtotal=Math.max(maxtotal , total);
        }
        return maxtotal;
        
    }
}