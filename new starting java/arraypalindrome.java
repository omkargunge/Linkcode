public class arraypalindrome {
    
    public static void main(String[] args) {

        // Declare and initialize array
        int[] arr = {121, 123, 454, 456, 787};

        // Check each element
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int temp = num;
            int rev = 0;

            // Reverse the number
            while (num > 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            // Check palindrome
            if (temp == rev) {
                System.out.println(temp);
            }
        }
    }
}

