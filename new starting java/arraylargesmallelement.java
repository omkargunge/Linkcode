public class arraylargesmallelement {
    
    public static void main(String[] args) {

        // Declare and initialize an array
        int[] arr = {10, 25, 5, 40, 15};

        // Assume first element is largest and smallest
        int largest = arr[0];
        int smallest = arr[0];

        // Find largest and smallest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Print results
        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
    }
}

