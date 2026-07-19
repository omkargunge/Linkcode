public class arrayreverse {
    
    public static void main(String[] args) {

        // Declare and initialize an array
        int[] arr = {10, 20, 30, 40, 50};

        // Print array in reverse order
        System.out.println("Array in reverse order:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

