class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st= new StringBuilder();
        int cnt=0;

        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(cnt>0) st.append(ch);
                cnt++;
            }else if(ch==')'){
                cnt--;
                if(cnt>0) st.append(ch);
            }
        }
        return st.toString();
        
    }
}