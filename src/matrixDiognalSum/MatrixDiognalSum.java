package matrixDiognalSum;

public class MatrixDiognalSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(arr));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; i++)
            sum += mat[n - 1 - i][i] + mat[i][i];
        return n % 2 == 1 ? sum - mat[n / 2][n / 2] : sum;
    }
}