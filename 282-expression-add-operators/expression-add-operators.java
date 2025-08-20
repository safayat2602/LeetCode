class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> li = new ArrayList<>();
        func(0,"",num,target,0,0,li);
        return li;
    }

    public static void func(int i,String path,String num,int target,long res,long prev,List<String> li) {
        if (i==num.length()) {
            if (res==target) li.add(path);
            return;
        }

        for (int j = i;j < num.length();j++) {
            if (j > i && num.charAt(i) == '0') break; 
            long curr = Long.parseLong(num.substring(i, j + 1));

            if (i == 0) {
                func(j + 1,path + curr,num,target,curr,curr,li);
            } else {
                func(j + 1,path+ "+" +curr,num,target,res + curr,curr,li);
                func(j + 1,path + "-" +curr,num,target,res - curr,-curr,li);
                func(j + 1,path + "*" +curr,num,target,res - prev + prev * curr, prev * curr,li);
            }
        }
    }
}
