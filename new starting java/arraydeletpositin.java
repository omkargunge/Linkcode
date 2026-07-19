import java.util.Scanner;
public class arraydeletpositin {
    


    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        // Shift elements to the left
        for (int i = pos - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Print array after deletion
        System.out.println("Array after deletion:");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

