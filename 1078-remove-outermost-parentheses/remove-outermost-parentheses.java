class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int cnt=0;
        for(char ch:s.toCharArray())
        {
            if(ch==')')
                cnt--;
            if(cnt!=0) ans+=ch;
            if(ch=='(') cnt++;
        }
        return ans;

    }
}