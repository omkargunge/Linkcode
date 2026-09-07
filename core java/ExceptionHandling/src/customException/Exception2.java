package customException;

import java.util.Scanner;


public class Exception2{


		static double bankBalance=1000;
		
		public static void main(String[] args)throws InsufficientAmount{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter amount to withdraw");
			int amount=sc.nextInt();
			
			withdraw(amount);
			
			System.out.println("thank you");
			
			
		}

		private static void withdraw(int amount) throws InsufficientAmount{
			if(bankBalance>amount)  {
				System.out.println("amount debited:"+amount);
				bankBalance-=amount;
				System.out.println("available balance: "+bankBalance);
				
			}else {
				throw new InsufficientAmount("inciffint amount to withdraw");
				
			}
			
		}
	}

