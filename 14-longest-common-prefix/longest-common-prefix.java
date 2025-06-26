class Solution {
    public String longestCommonPrefix(String[] v) {
        if (v == null || v.length == 0) return "";
        
        String ans = v[0];
        for (int i = 1; i < v.length; i++) {
            while (!v[i].startsWith(ans)) {
                ans = ans.substring(0, ans.length() - 1);
                if (ans.equals("")) return "";
            }
        }
        return ans;
    }
}
