class Solution {
    public int characterReplacement(String s, int k) {
        int left=0, right=0;
        int maxcount=0;
        int[] freq=new int[26];
        int maxlen=0;

        while(right< s.length()){
            freq[s.charAt(right)-'A']++;

            maxcount=Math.max(maxcount,freq[s.charAt(right)-'A']);

            if((right-left+1)-maxcount>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}