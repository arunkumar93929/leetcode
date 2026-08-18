class Solution {
    public long subArrayRanges(int[] nums) {
        return maxi(nums)- mini(nums);
    }
    int[] Psee(int[] nums){
        Stack<Integer> st=new Stack<>();
        int[] ans= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            ans[i]=!st.isEmpty()?st.peek():-1;
            st.push(i);
        }
        return ans;
    }
    int[] Nge(int[] nums){
        int n=nums.length;
        Stack<Integer> st= new Stack<>();
        int[] ans=  new int[n]; 

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<= nums[i]){
                st.pop();
            }
            ans[i]=!st.isEmpty()? st.peek():n;
            st.push(i);
        }
        return ans;
    }
    private int[] Nse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }
    private int[] Pgee(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }
    private long mini(int[] arr) {
        int n = arr.length;
        int[] nse = Nse(arr);
        int[] psee = Psee(arr);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            long freq = 1L * left * right;
            sum += freq * arr[i];
        }
        return sum;
    }
    private long maxi(int[] arr) {
        int n = arr.length;
        int[] nge = Nge(arr);
        int[] pgee = Pgee(arr);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i - pgee[i];
            int right = nge[i] - i;
            long freq = 1L * left * right;
            sum += freq * arr[i];
        }
        return sum;
    }
}