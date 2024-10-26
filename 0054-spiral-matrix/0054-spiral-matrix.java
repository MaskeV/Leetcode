import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {  
        int rs = 0; // starting row
        int re = matrix.length - 1; // ending row
        int cs = 0; // starting column
        int ce = matrix[0].length - 1; // ending column
        
        List<Integer> result = new ArrayList<>();
        
        while (rs <= re && cs <= ce) {
            // Traverse from left to right
            for (int i = cs; i <= ce; i++) {
                result.add(matrix[rs][i]);
            }
            rs++;
            
            // Traverse downwards
            for (int i = rs; i <= re; i++) {
                result.add(matrix[i][ce]);
            }
            ce--;
            
            if (rs <= re) {
                // Traverse from right to left
                for (int i = ce; i >= cs; i--) {
                    result.add(matrix[re][i]);
                }
                re--;
            }
            
            if (cs <= ce) {
                // Traverse upwards
                for (int i = re; i >= rs; i--) {
                    result.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        
        return result;
    }
}
