class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Set<Integer> s=new HashSet<>();
       for(int val:nums)
       {
        s.add(val);
       }
       ArrayList<Integer> li=new ArrayList<>();
       for(int i=1;i<=nums.length;i++)
       {
        if(!s.contains(i))
        {
            li.add(i);
        }
       }
       return li;
    }
}