public class arraycounteven {
    
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35, 40};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count of even numbers = " + count);
    }
}

