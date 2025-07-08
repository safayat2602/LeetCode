class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> hm=new HashMap<>();
       if(s.length()!=t.length()) return false;
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        char ch1=t.charAt(i);
        if(hm.containsKey(ch))
        {
            if(!hm.get(ch).equals(ch1))
            {
                return false;
            }
        }
        else{
            if(hm.containsValue(ch1))
            {
                return false;
            }
        }
        hm.put(ch,ch1);
       }
       return true;
    }
}