class Solution {
    public int minDays(int[] arr, int m, int k) {
        if(m*k>arr.length)return -1;
        int min= Arrays.stream(arr).min().getAsInt();
        int max= Arrays.stream(arr).max().getAsInt();
        int res=-1;
        while(min<=max){
            int mid = min+(max-min)/2;
            if(poss(arr, mid, m, k)){
                res=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return res;
    }
    boolean poss(int[] arr, int day, int m , int k ){
        int count=0;
        int boq=0;
        for(int a: arr){
            if(a<=day){
                count++;
                if(count==k){
                    boq++;
                    count=0;
                }
            }else{
                count=0;
            }
        }
        return boq>=m;
    }
}