package edu.qspiders.demo1;

import java.util.Scanner;
class prime 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number...");
		int num=sc.nextInt();
		int count=0;
		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (num==2)
		{
			System.out.println(num+" :it is a prime no");

		}
		else if (num==1)
		{
			System.out.println(num+" :it's a nor prime or composite number ");

		}
		else
		{
			System.out.println(num+" :it is not a Prime no");

		}
	}
}

