import java.util.Arrays;

public class methodnangram {

    public static char[] bubblesort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String Str1 = "slient";
        String Str2 = "listen";

        if (Str1.length() != Str2.length()) {
            System.out.println("not anagram");
            return;
        }

        char[] arr1 = bubblesort(Str1.toCharArray());
        char[] arr2 = bubblesort(Str2.toCharArray());

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}