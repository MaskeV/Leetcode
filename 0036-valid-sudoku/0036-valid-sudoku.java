class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Set<Integer> row = new HashSet<>();
        // Set<Integer> column = new HashSet<>();
        // Set<Integer> block = new HashSet<>();
        Set set = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(num!='.'){
                    if(!set.add(num+"in row"+i) || !set.add(num+"in column"+j)|| !set.add(num +"in block"+ i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;

    }
}





// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//          Set seen = new HashSet();
//     for (int i=0; i<9; ++i) {
//         for (int j=0; j<9; ++j) {
//             char number = board[i][j];
//             if (number != '.')
//                 if (!seen.add(number + " in row " + i) ||
//                     !seen.add(number + " in column " + j) ||
//                     !seen.add(number + " in block " + i/3 + "-" + j/3))
//                     return false;
//         }
//     }
//     return true;
//     }
// }