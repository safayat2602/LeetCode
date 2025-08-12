class Solution {
    public List<String> letterCombinations(String digits) {
        String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<>();
        if(digits.length()==0)
        {
            return ans;
        }
        func(0,digits,new StringBuilder(),ans,map);
        return ans;
    }
    public static void func(int ind,String digits,StringBuilder path,List<String> ans,String map[])
    {
        if(ind==digits.length())
        {
            ans.add(path.toString());
            return;
        }
        String letters=map[digits.charAt(ind)-'0'];
        for(char ch:letters.toCharArray())
        {
            path.append(ch);
            func(ind+1,digits,path,ans,map);
            path.deleteCharAt(path.length()-1);
        }
    }
}