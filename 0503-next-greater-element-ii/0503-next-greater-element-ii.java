class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int[]  ng= new int[nums.length];
        Arrays.fill(ng,-1);
        Stack<Integer> st= new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            int num= nums[i%n];

            while(!st.isEmpty() && st.peek()<=num){
                st.pop();
            }
            if(!st.isEmpty()){
                ng[i%n]=st.peek();
            }
            
            st.push(num);
        }        
        return ng;
    }
}