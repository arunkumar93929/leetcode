class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0, ten=0;

        for(int x: bills){
            if(x==5){
                five+=1;
            }
            else if(x== 10){
                if(five>0) {
                    five--;
                    ten+=1;
                }else { 
                    return false;
                }

            }else{
                if(five>0 && ten>0){
                    five-=1;
                    ten-=1;
                }else if(five>= 3){
                    five-=3;
                }else {
                    return false;
                }
            }
        }
        return true;
        
    }
}