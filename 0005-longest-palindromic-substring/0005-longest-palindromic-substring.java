class Solution {
    public String longestPalindrome(String s) {
        for(int i=s.length();i>0;i--){
            for(int j=0;j<= s.length()-i;j++){
                if(help(j,i+j,s)){
                    return s.substring(j,i+j);
                }
            }
        }
        return "";
    }
    boolean help(int x,int y, String s){
        int left=x;
        int right=y-1;

        while(left< right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}