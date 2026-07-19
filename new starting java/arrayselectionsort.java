public class arrayselectionsort {
    
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] arr = {5, 3, 8, 4, 2};

        // Outer loop - selects each position one by one
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current element is the minimum
            int min = i;

            // Find the smallest element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the smallest element with the current position
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

