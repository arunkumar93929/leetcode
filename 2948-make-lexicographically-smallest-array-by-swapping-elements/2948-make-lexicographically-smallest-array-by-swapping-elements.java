class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        int currGroup = 0;
        Map<Integer, Integer> numToGroup = new HashMap<>();
        numToGroup.put(sortedNums[0], currGroup);
        
        Map<Integer, LinkedList<Integer>> groupToList = new HashMap<>();
        groupToList.put(currGroup, new LinkedList<>(Arrays.asList(sortedNums[0])));
        
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(sortedNums[i] - sortedNums[i - 1]) > limit) {
                currGroup++;
            }
            numToGroup.put(sortedNums[i], currGroup);
            groupToList.computeIfAbsent(currGroup, k -> new LinkedList<>()).add(sortedNums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int group = numToGroup.get(num);
            nums[i] = groupToList.get(group).pollFirst();
        }
        return nums;
    }
}