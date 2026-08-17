class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nqe= new int[nums1.length];
        Stack<Integer> st= new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();

        for(int num: nums2){
            while(!st.isEmpty() && st.peek()<num){
                mp.put(st.pop(), num);
            }
            st.push(num);
        }
        for(int i=0;i<nums1.length;i++){
            nqe[i]=mp.getOrDefault(nums1[i],-1);
        }
        return nqe;
        
        
    }
}