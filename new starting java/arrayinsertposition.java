 import java.util.Scanner;
public class arrayinsertposition {
   


    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5; // Current number of elements

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.print("Enter element: ");
        int item = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[pos - 1] = item;
        n++;

        // Print the array
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

