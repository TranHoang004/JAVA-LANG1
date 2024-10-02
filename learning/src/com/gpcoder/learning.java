package com.gpcoder;

import java.util.Scanner;

public class learning {

	private static int num;
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the number greater than zero: ");
			num = scanner.nextInt();
			
			int sum = 0;
			for (int i = 1; i <= Math.sqrt(num); i++)
	        {
	            if (num % i == 0)
	            {
	                if (i == (num / i))
	                    sum += i;
	                else
	                    sum += (i + num / i);
	            }
	        }
			System.out.println("Sum of all divisors is: "+sum+" ");
		}
	}
}