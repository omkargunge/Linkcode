package Throw;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Exception {


		static double bankBalance=1000;
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter amount to withdraw");
			int amount=sc.nextInt();
			
			withdraw(amount);
			
			System.out.println("thank you");
			
			
		}

		private static void withdraw(int amount) {
			if(bankBalance>amount)  {
				System.out.println("amount debited:"+amount);
				bankBalance-=amount;
				System.out.println("available balance: "+bankBalance);
				
			}else {
				throw new ArithmeticException("inciffint amount to withdraw");
				
			}
			
		}
	}

