public class arraysumelement {
    
    public static void main(String[] args) {

        // Declare and initialize an array
        int[] arr = {10, 20, 30, 40, 50};

        // Variable to store sum
        int sum = 0;

        // Add all array elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Print the sum
        System.out.println("Sum of array elements = " + sum);
    }
}

