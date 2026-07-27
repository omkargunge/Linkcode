//package mobilescanner;
//
//import java.util.Scanner;
//public class Main {
//	static Scanner sc=new Scanner(System.in);
//	static Mobile mobiles[];
//	
//	public static void main(String[]args) {
//		System.out.println("enter no of mobiles:");
//		int n=sc.nextInt();
//		
//		mobiles=new Mobile[n];
//		
//		for(int i=0;i<n;i++) {
//			System.out.println("enter mobile("+(i+1)+"):");
//			System.out.println("enter cname:");
//			String cname=sc.next();
//			System.out.println("enter color:");
//			String color=sc.next();
//			mobiles[i]=new Mobile(cname,color,0,0,0);
//		}
//		System.out.println(mobiles[0].cname);
//	}
//}
package mobilescanner;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Mobile mobiles[];

    public static void main(String[] args) {

        System.out.println("Enter no of mobiles:");
        int n = sc.nextInt();

        mobiles = new Mobile[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Mobile " + (i + 1));

            System.out.print("Enter company name: ");
            String cname = sc.next();

            System.out.print("Enter color: ");
            String color = sc.next();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter camera (MP): ");
            int cam = sc.nextInt();

            System.out.print("Enter storage (GB): ");
            int storage = sc.nextInt();

            mobiles[i] = new Mobile(cname, color, price, cam, storage);
        }

        System.out.println("\n----- Mobile Details -----");

        for (int i = 0; i < n; i++) {
            System.out.println("Company : " + mobiles[i].cname);
            System.out.println("Color   : " + mobiles[i].color);
            System.out.println("Price   : " + mobiles[i].price);
            System.out.println("Camera  : " + mobiles[i].cam + " MP");
            System.out.println("Storage : " + mobiles[i].storage + " GB");
            System.out.println();
        }
    }
}