class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        func(0,s,ans,new ArrayList<>());
        return ans;
    }
    public static void func(int ind,String s,List<List<String>> ans,List<String> li)
    {
        if(ind==s.length())
        {
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=ind;i<s.length();i++)
        {
            if(isPalindrome(ind,i,s))
            {
               li.add(s.substring(ind,i+1));
               func(i+1,s,ans,li);
               li.remove(li.size()-1);
            }
        }
    }
    public static boolean isPalindrome(int left,int right,String s)
    {
        while(left<=right)
        {
          if(s.charAt(left)!=s.charAt(right))
          {
            return false;
            
          }
          left++;
            right--;
        }
        return true;
    }
}