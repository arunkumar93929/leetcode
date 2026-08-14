class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> mp = new HashMap<>();
        int left=0;
        int maxlen=Integer.MIN_VALUE;
        for(int right=0;right< fruits.length;right++){
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            if(mp.size()>2){
                mp.put(fruits[left],mp.get(fruits[left])-1);
                if(mp.get(fruits[left])==0){
                    mp.remove(fruits[left]);
                }
                left++;

            }
            maxlen=Math.max(maxlen, right-left+1);
        }
        return maxlen;
        
    }
}