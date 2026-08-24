class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        add(0, nums, arr, res, target);
        return res;
    }

    void add(int st, int[] nums, List<Integer> arr, List<List<Integer>> res, int target) {
        if (target < 0)
            return;
        else if (target == 0) {
            res.add(new ArrayList<>(arr));
            return;
        } else {
            for (int i = st; i < nums.length; i++) {
                // if (i > st && nums[i] == nums[i - 1]){
                //     continue; // skip duplicates
                // }
                arr.add(nums[i]);
                add(i , nums, arr, res, target - nums[i]);
                arr.remove(arr.size() - 1);
            }
        }
    }
}