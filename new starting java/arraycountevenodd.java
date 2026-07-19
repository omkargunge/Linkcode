public class arraycountevenodd {
    
    public static void main(String[] args) {

        // Declare and initialize an array
        int[] arr = {10, 15, 20, 25, 30};

        // Variables to count even and odd numbers
        int even = 0;
        int odd = 0;

        // Check each element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Print the result
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}

