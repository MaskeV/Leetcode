class Solution {
    public boolean isValidSudoku(char[][] board) {
       for(int i=0;i<9;i++){

          HashSet<Character> row = new HashSet<>();
          HashSet<Character> col = new HashSet<>();

          for(int j=0;j<9;j++){

            if(board[i][j]!='.'){
           if(row.contains(board[i][j])){
            return false;
           }
            row.add(board[i][j]);
            }

            if(board[j][i]!='.'){

           if(col.contains(board[j][i])){
            return false;
           }
            col.add(board[j][i]);
            }
          }
       }


      for(int i=0;i<9;i+=3){
        for(int j=0;j<9;j+=3){
            Set<Character> block  = new HashSet<>();
          for(int k=i;k<i+3;k++){
            for(int l=j;l<j+3;l++){
                if(board[k][l]!='.'){
                    if(block.contains(board[k][l])){
                        return false;
                    }

                    block.add(board[k][l]);
                }
            }
          }
        }
      }


       return true;
    }
}