import java.util.Scanner;
public class methodrecursiontable {
    



    static void table(int n, int i) {
        if (i > 10)
            return;

        System.out.println(n + " x " + i + " = " + (n * i));
        table(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        table(n, 1);
    }
}

