import java.util.Scanner;

public class arraybubblesort2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length for array");

        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("enter values for an array:");

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}