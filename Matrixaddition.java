import java.util.Arrays;
public class Matrixaddition {
    public static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int[][] C = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    public static void main(String[] args) {
        int[][] A = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };
        int[][] B = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };
        int[][] result = add(A, B);
        System.out.println(Arrays.deepToString(result));
        //[[2, 2, 2], [4, 4, 4], [6, 6, 6], [8, 8, 8]]
    }
}





