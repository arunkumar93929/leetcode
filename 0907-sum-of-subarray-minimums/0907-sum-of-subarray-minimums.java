class Solution {
    int MOD=(int)1e9+7;
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int ans=0;
        int[] nse=Nse(arr);
        int[] pse = Psee(arr);

        for(int i=0;i<n;i++){
            int left= i-pse[i];
            int right= nse[i]-i;
            
            long freq= left*right*1L;

            int val= (int)((freq*arr[i])%MOD);
            
            ans=(ans+val)%MOD;

        }
        return ans;
    }
    int[] Nse(int[] arr){
        Stack<Integer>  st= new Stack<>();
        int[] nse= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>= arr[i]){
                st.pop();
            }
            nse[i]= !st.isEmpty()?st.peek():arr.length;
            st.push(i);
        }
        return nse;
    }
    int[] Psee(int[] arr){
        Stack<Integer> st= new Stack<>();
        int[] pse= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }

            pse[i]=!st.isEmpty()?st.peek():-1;

            st.push(i);
        }
        return pse;

    }
}