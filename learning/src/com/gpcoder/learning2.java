package com.gpcoder;

import java.util.Scanner;

public class learning2 {

	private static int originalNum, num;
	
	void Countnumber()
	{
		int count = 0;
		num = originalNum;
		while (num > 0)
		{ 
			num = num /10;
			count++;
		}
		System.out.println("Number of digits is: "+count+"");
	}
	
	void Firstdigit()
	{
		int Firstdigit = originalNum;
		while (Firstdigit >= 10)
		{
			Firstdigit=Firstdigit/10;
		}
		System.out.println("First digit is: "+Firstdigit+"");
	}
	
	void Lastdigit()
	{
		int Lastdigit = originalNum % 10;
		System.out.println("Last digit is: "+Lastdigit+"");
		
	}
	
	void SumAllOfDigits()
	{
		int sum = 0;
		num = originalNum;
		while (num > 0)
		{
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of all digits is: "+sum+"");
	}
	void ReverseOfN()
	{
			int reverse = 0;
			num = originalNum;
			while (num != 0)
			{
				int digit = num % 10;
				reverse = reverse * 10 + digit;
				num = num / 10;
			}
			System.out.println("Reverse of number is: "+reverse+"");
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the N: ");
			originalNum = scanner.nextInt();
			learning2 l = new learning2();
			l.Countnumber();
			l.Firstdigit();
			l.Lastdigit();
			l.SumAllOfDigits();
			l.ReverseOfN();
		}
	}
}
