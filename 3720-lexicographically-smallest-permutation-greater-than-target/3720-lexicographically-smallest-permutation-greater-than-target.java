class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] cnt= new int[26];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
            cnt[target.charAt(i)-'a']--;
        }
        char[] t = target.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            int b=t[i]-'a';
            cnt[b]++;

            boolean possible= true;
            for(int c: cnt) {
                if(c<0){
                    possible = false;
                } 
            }
            if(!possible) continue;

            for(int j=b+1;j< 26;j++){
                if(cnt[j]>0){
                    cnt[j]--;
                    t[i]=(char)('a'+j);
                    StringBuilder st= new StringBuilder();
                    st.append(t, 0, i+1);
                    for(int k=0;k<26;k++){
                        while(cnt[k]>0){
                            st.append((char)('a'+k));
                            cnt[k]--;
                        }
                    }
                    return st.toString();
                }

            }
        }
        return "";
        
    }
}