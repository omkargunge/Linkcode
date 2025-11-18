import java.util.Scanner;

public class arrayexaplel {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements do you want in array");
        int n = sc.nextInt(); // e.g., n = 5

        int arr[] = new int[n];

        System.out.println("Enter " + n + " numbers in array\n");

        // FIXED: removed semicolon after for loop
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Enhanced for loop to print elements
        for(int i : arr){
            System.out.println(i);
        }

        // Regular for loop to print elements
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
