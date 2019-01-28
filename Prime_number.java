/*Write a java program to check prime number.*/

import java.util.Scanner;
public class Prime_number
{
	public static void main(String args[])
	{
		int temp;
		boolean isprime=true;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number:");
		int num = scan.nextInt();
		scan.close();
		for(int i=2; i<=num; i++)
		{
			temp = num%i;
			if(temp == 0)
			{
				isprime = false ;
				break;
			}
		}
			if(isprime)
				System.out.print(num + " is a prime number");
			
			else
				System.out.print(num + "is not a prime number");
			
		
	}
}