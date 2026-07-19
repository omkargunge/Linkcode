public class arraybubblesort {
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] arr = {5, 3, 8, 4, 2};

        // Outer loop - controls the number of passes
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop - compares adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // If the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {

                    // Swap the two elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}