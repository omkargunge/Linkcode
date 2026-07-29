package Abstraction2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount :");
		int amount=sc.nextInt();
		System.out.println("Total Amount to pay");
		System.out.println("select payment mode");
		System.out.println("1.UPI payment");
		System.out.println("2.Credit Card");
		System.out.println("3.Cash On Delivery");
		int ch=sc.nextInt();
		switch(ch) {
		
		case 1->{
			Payment pay=new Gpay();
			pay.Payment(amount);}
		case 2->{
			Payment pay=new CreditCard();
			pay.Payment(amount);}
		case 3->{
			Payment pay=new Cash();
			pay.Payment(amount);}
		
		
		}
		}
	}


