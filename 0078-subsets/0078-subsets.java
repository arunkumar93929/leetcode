class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        add(nums , 0, arr, res);
        return res;
    }
    void add(int[] nums, int index,List<Integer> arr, List<List<Integer>> res){
        if(index== nums.length){
            res.add(new ArrayList<>(arr));
            return ;
        }

        arr.add(nums[index]);
        add(nums, index+1, arr, res);

        arr.remove(arr.size()-1);
        add(nums, index+1,arr, res);
        

    }
}