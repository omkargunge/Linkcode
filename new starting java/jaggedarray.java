import java.util.*;

public class jaggedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row length: ");
        int row = sc.nextInt();

        int[][] arr = new int[row][];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter column length for row " + (i + 1) + ": ");
            int col = sc.nextInt();
            arr[i] = new int[col];
        }

        System.out.println("Enter values:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array contents:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}