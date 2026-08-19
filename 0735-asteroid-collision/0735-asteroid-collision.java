class Solution {
    public int[] asteroidCollision(int[] nums) {
        int n= nums.length;
        List<Integer> arr= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr.add(nums[i]);
            }else{
            while(!arr.isEmpty() &&arr.get(arr.size()-1)>0&&
                   arr.get(arr.size()-1)<Math.abs(nums[i])){
                arr.remove(arr.size()-1);
            }
            if(!arr.isEmpty() && arr.get(arr.size()-1)==Math.abs(nums[i])){
                arr.remove(arr.size()-1);
            }else if(arr.isEmpty()|| arr.get(arr.size()-1)<0){
                arr.add(nums[i]);
            }
            }
        }
       
       int[] ans=new int[arr.size()];
       for(int i=0;i<arr.size();i++){
        ans[i]=arr.get(i);
       }
    return ans;
       }
        
    }
