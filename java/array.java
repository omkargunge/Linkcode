import java.util.Scanner;

public class ArrayOperationMain {
    public static void main(String[] args) {

        String str = null;
        final int max = 20;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        int arr[] = new int[max];
        ArrayOperation arrobj = new ArrayOperation();

        do {
            System.out.println("1- Create \n2- Display \n3- Search \n4- Sort \n5- Insert \n6- Delete ");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    n = arrobj.create(arr);
                    break;

                case 2:
                    System.out.println("Elements in array are:");
                    arrobj.display(arr, n);
                    break;

                case 3:
                    System.out.println("Enter element to search in array:");
                    int search = sc.nextInt();
                    boolean b = arrobj.search(arr, n, search);
                    if (b) {
                        System.out.println("Element found in array");
                    } else {
                        System.out.println("Element not found in array");
                    }
                    break;

                case 4:
                    arrobj.sort(arr, n);
                    System.out.println("Sorting done successfully");
                    break;

                case 5:
                    System.out.println("Enter new value and location to insert in array:");
                    int newvalue = sc.nextInt();
                    int loc = sc.nextInt();
                    n = arrobj.insert(arr, n, newvalue, loc);
                    break;

                case 6:
                    System.out.println("Enter location to delete value:");
                    int dloc = sc.nextInt();
                    n = arrobj.delete(arr, n, dloc);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println("Do you want to continue? (y/n): ");
            str = sc.next();

        } while (str.equalsIgnoreCase("y"));

        sc.close();
    }
}