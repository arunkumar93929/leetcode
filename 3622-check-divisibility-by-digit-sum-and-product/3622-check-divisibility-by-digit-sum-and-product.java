class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum=0;
        int pro=1;
        int x=n;

        while(x>0){
            int q=x%10;
            sum+=q;
            pro*=q;
            x=x/10;
        }
        return n%(sum+pro)==0;
    }
}