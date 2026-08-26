class Solution {
    public boolean isSubsequence(String s, String t) {
        return solve(s,0, t,0);    
    }
    boolean solve( String s, int i, String t, int j){
        if(i==s.length()){
            return true;
        }
        if(j==t.length()){
            return false;
        }
        if(s.charAt(i)== t.charAt(j)){
            return solve(s,i+1, t, j+1);
    
        }
        return solve(s, i, t, j+1);
    }
}