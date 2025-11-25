import java.util.Scanner;

public class arrayperation {

    Scanner sc = new Scanner(System.in);

    // CREATE ARRAY
    public int create(int arr[]) {
        System.out.print("How many numbers do you want in array? ");
        int n = sc.nextInt();

        if (n > arr.length) {
            System.out.println("Array size is too small!");
            return 0;
        }

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return n;
    }

    // DISPLAY ARRAY
    public void display(int arr[], int n) {
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // SEARCH ELEMENT
    public boolean search(int arr[], int n, int search) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                return true;
            }
        }
        return false;
    }

    // SORT ARRAY
    public void sort(int arr[], int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // INSERT ELEMENT
    public int insert(int arr[], int n, int loc, int newValue) {

        if (loc < 1 || loc > n + 1) {
            System.out.println("Invalid location!");
            return n;
        }

        if (n == arr.length) {
            System.out.println("Array is full! Cannot insert");
            return n;
        }

        for (int i = n; i >= loc; i--) {
            arr[i] = arr[i - 1];
        }

        arr[loc - 1] = newValue;
        return n + 1;
    }

    // DELETE ELEMENT
    public int delete(int arr[], int n, int loc) {

        if (loc < 1 || loc > n) {
            System.out.println("Invalid location!");
            return n;
        }

        for (int i = loc - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1;
    }

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            arrayperation ao = new arrayperation();

            int arr[] = new int[100]; // array size
            int n = 0; // current number of elements
            int choice;

            do {
                System.out.println("\n===== ARRAY OPERATIONS MENU =====");
                System.out.println("1. Create Array");
                System.out.println("2. Display Array");
                System.out.println("3. Search Element");
                System.out.println("4. Sort Array");
                System.out.println("5. Insert Element");
                System.out.println("6. Delete Element");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        n = ao.create(arr);
                        break;

                    case 2:
                        ao.display(arr, n);
                        break;

                    case 3:
                        System.out.print("Enter element to search: ");
                        int s = sc.nextInt();
                        if (ao.search(arr, n, s))
                            System.out.println("Element FOUND in array");
                        else
                            System.out.println("Element NOT found");
                        break;

                    case 4:
                        ao.sort(arr, n);
                        System.out.println("Array sorted successfully!");
                        break;

                    case 5:
                        System.out.print("Enter position to insert: ");
                        int loc = sc.nextInt();
                        System.out.print("Enter value: ");
                        int val = sc.nextInt();
                        n = ao.insert(arr, n, loc, val);
                        break;

                    case 6:
                        System.out.print("Enter position to delete: ");
                        int dloc = sc.nextInt();
                        n = ao.delete(arr, n, dloc);
                        break;

                    case 7:
                        System.out.println("Exiting... Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } while (choice != 7);
        }
    }
}