class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        add(n,1 , k, arr, res);
        return res;
    }
    void add(int n,int st, int k, List<Integer> arr,List<List<Integer>> res){
        if(arr.size()==k){
            res.add(new ArrayList<>(arr));
            return;
        }
        
        for(int num=st;num<=n;num++ ){
            arr.add(num);
            add(n,num+1, k, arr, res);
            arr.remove(arr.size()-1);
        }
    }
}