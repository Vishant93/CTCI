package ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Set<Integer> r = new HashSet();
        Set<Integer> c = new HashSet();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (r.contains(i) || c.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
