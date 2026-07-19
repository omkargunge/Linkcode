//  import java.util.Scanner;
// public class arraylinersearch {
   


//     public static void main(String[] args) {

//         // Declare and initialize the array
//         int[] arr = {10, 20, 30, 40, 50};

//         // Take number to search
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number to search: ");
//         int key = sc.nextInt();

//         // Variable to check if number is found
//         boolean found = false;

//         // Linear search
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 System.out.println("Element found at index " + i);
//                 found = true;
//                 break;
//             }
//         }

//         // If number is not found
//         if (!found) {
//             System.out.println("Element not found");
//         }
//     }
// }


import java.util.Scanner;

public class arraylinersearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found");
                return;
            }
        }

        System.out.println("Element not found");
    }
}