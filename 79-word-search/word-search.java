class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        boolean bool[][]=new boolean[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(func(i,j,bool,board,word,0))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean func(int i,int j,boolean bool[][],char board[][],String word,int ind)
    {
        if(ind==word.length())
        {
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || bool[i][j] || board[i][j]!=word.charAt(ind))
        {
            return false;
        }
        bool[i][j]=true;
        boolean result=func(i+1,j,bool,board,word,ind+1)||
        func(i-1,j,bool,board,word,ind+1)||
        func(i,j+1,bool,board,word,ind+1)||
        func(i,j-1,bool,board,word,ind+1);
        bool[i][j]=false;
        return result;
    }
}