class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> sub = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        solve(nums, 0, sub, res);
        return res;
    }

    void solve(int[] nums, int index, List<Integer> sub, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[index]);
        solve(nums, index+1, sub, res);
        sub.remove(sub.size()-1);
        solve(nums, index+1, sub, res);
    }
}