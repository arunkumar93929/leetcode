class Solution {
    public int totalFruit(int[] fruits) {
        int maxlen=0;
        int lastfruit=-1, seclast=-1;

        int curr =0, lastcurr=0;

        for(int fruit: fruits){

            if(fruit==lastfruit || fruit== seclast){
                curr++;
            }
            else{
                curr= lastcurr+1;
            }

            if(fruit== lastfruit){
                lastcurr++;
            }else{
                lastcurr=1;
                seclast=lastfruit;
                lastfruit= fruit;
            }
            maxlen=Math.max(maxlen, curr);
        }
        return maxlen;
        
    }
}