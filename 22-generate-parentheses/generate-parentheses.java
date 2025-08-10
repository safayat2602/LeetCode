class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
        func(n,0,0,li,"");
        return li;
    }
    public static void func(int n,int open,int close,List<String> li,String ans)
    {
        if(ans.length()==(2*n))
        {
            li.add(ans);
            return;
        }
        if(open<n)
        {
            func(n,open+1,close,li,ans+'(');
        }
        if(close<open)
        {
            func(n,open,close+1,li,ans+')');
        }
    }
}