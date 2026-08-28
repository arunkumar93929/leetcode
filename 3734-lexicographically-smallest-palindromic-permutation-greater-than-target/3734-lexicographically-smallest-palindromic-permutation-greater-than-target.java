class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        if (n == 1) return s.compareTo(target) > 0 ? s : "";
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) cnt[c - 'a']++;
        String oddChar = "";
        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 == 1) {
                if (!oddChar.isEmpty()) return "";
                oddChar = String.valueOf((char)('a' + i));
            }
            cnt[i] /= 2;
        }
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            boolean placed = false;
            for (int j = 0; j < 26; j++) {
                if (cnt[j] > 0) {
                    cnt[j]--; prefix.append((char)('a' + j));
                    StringBuilder remLeft = new StringBuilder();
                    for (int k = 25; k >= 0; k--) {
                        for (int count = 0; count < cnt[k]; count++) remLeft.append((char)('a' + k));
                    }
                    String candLeft = prefix.toString() + remLeft.toString();
                    String candPal = candLeft + oddChar + new StringBuilder(candLeft).reverse().toString();
                    if (candPal.compareTo(target) > 0) {
                        placed = true; break;
                    }
                    prefix.deleteCharAt(prefix.length() - 1); cnt[j]++;
                }
            }
            if (!placed) return "";
        }
        String finalLeft = prefix.toString();
        return finalLeft + oddChar + new StringBuilder(finalLeft).reverse().toString();
    }
}