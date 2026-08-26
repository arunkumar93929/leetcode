class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n= s.length();
        int cnt=0;
        for(char ch: s.toCharArray()){
            if(ch== '1'){
                cnt++;
            }
        }
        if(cnt<k) return "";
        int left=0, ones=0;
        String ans=s;
        for(int right=0;right< n;right++){
            if(s.charAt(right)=='1') ones++;

            while(ones>k ||(left<= right && s.charAt(left)=='0')){
                if(s.charAt(left)=='1') ones--;
                left++;
            }
            if(ones==k){
                String t = s.substring(left, right+1);
                if(t.length()< ans.length() || (t.length()<= ans.length() && t.compareTo(ans)<0))ans=t;
            }
        }  
        return ans;
    }
}