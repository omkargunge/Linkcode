import java.util.Scanner;

public class MatrixOperation {

    Scanner sc = new Scanner(System.in);

    public int[][] create() {
        System.out.println("How many rows do you want in the matrix?");
        int row1 = sc.nextInt();

        int[][] mat1 = new int[row1][];
        for (int i = 0; i < mat1.length; i++) {
            System.out.print("How many columns do you want in matrix for row " + (i + 1) + ": ");
            int c1 = sc.nextInt();
            mat1[i] = new int[c1];
        }
        return mat1;
    }

    public boolean validate(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) return false;
        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) {
                return false;
            }
        }
        return true;
    }

    public void input(int[][] mat) {
        System.out.println("Enter elements in the matrix:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public int[][] matrixaddition(int[][] mat1, int[][] mat2) {
        int[][] mat3 = new int[mat1.length][];
        for (int i = 0; i < mat3.length; i++) {
            mat3[i] = new int[mat1[i].length];
        }

        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return mat3;
    }

    public void display(int[][] mat) {
        System.out.println("Matrix:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // ✅ ADD THIS METHOD:
    public static void main(String[] args) {
        MatrixOperation mo = new MatrixOperation();

        int[][] matrix1 = mo.create();
        mo.input(matrix1);

        int[][] matrix2 = mo.create();
        mo.input(matrix2);

        if (mo.validate(matrix1, matrix2)) {
            int[][] result = mo.matrixaddition(matrix1, matrix2);
            mo.display(result);
        } else {
            System.out.println("Matrix sizes do not match. Cannot perform addition.");
        }
    }
}
