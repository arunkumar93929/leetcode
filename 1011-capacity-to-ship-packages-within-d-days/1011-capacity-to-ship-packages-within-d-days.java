class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int left=Arrays.stream(arr).max().getAsInt();
        int right=Arrays.stream(arr).sum();

        while(left< right){
            int mid= left+(right-left)/2;
            
            int need= needed(arr, mid);

            if(need<=days){
                right=mid;
            }else{
                left=mid+1;
            }

        }
        return left;
        
        
    }
    int needed(int[] nums, int days){
            int day=1;
            int load=0;

            for(int n:nums){
                if(load+n>days){
                    day++;
                    load=n;
                }else{
                    load+=n;
                }
            }
            return day;
        }
}