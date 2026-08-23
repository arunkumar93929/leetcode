class Solution {
    public boolean sumGame(String s) {
        int leftsum=0;
        int rightsum=0;
        int n=s.length();
        int leftq=0;
        int rightq=0;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)=='?'){
                leftq++;
            }else {
                leftsum+=s.charAt(i)-'0';
            }

        }
          for(int i=n/2;i<n;i++){
            if(s.charAt(i)=='?'){
                rightq++;
            }else {
                rightsum+=s.charAt(i)-'0';
            }

        }
        int sumdiff=leftsum-rightsum;
        int qdiff=leftq-rightq;

        if(qdiff==0){
            if(sumdiff==0){
                return false;
            }else {
                return true;
            }
        }else if((leftq+rightq)%2!=0){
            return true;
        }else{

            int maxdif= -9*qdiff/2;
            if(sumdiff==maxdif){
                return false;
            }else{
                return true;
            }
        }

        
    }
}