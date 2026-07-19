public class arrayeven {
    
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35, 40};

        System.out.println("Even numbers are:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

