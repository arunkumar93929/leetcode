class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> set= new HashSet<>();

        int longest= Integer.MIN_VALUE;
        if(n==0){
            return 0;
        }

        for(int x:nums){
            set.add(x);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int cnt=1;
                int x=num;

                while(set.contains(x+1)){
                    cnt+=1;

                    x++;
                }
                longest=Math.max(longest, cnt);
            }
        }
        return longest;
    }
}