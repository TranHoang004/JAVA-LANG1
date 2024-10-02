package com.gpcoder;

//import java.util.Scanner;

public class learning3 {
	static void  PrintAllElements(int[] A)
	{
        System.out.println("All elements: ");
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }	
	
	static void PrintEvenIntegers(int [] A)
	{
		System.out.println("Even integers: ");
        for (int i : A) {
        	if (i % 2 == 0) {
                System.out.print(i + " ");
        	}
        }
    	System.out.println();
	}
	static void PrintOddIntegers(int [] A)
	{
		System.out.println("Odd integers: ");
        for (int i : A) {
        	if (i % 2 != 0) {
                System.out.print(i + " ");
        	}
        }
    	System.out.println();
	}
	static void PrintPositiveIntegers(int [] A)
	{
		System.out.println("Positive integers: ");
        for (int i : A) {
        	if (i >= 0) {
                System.out.print(i + " ");
        	}
        }
    	System.out.println();
	}
	static void PrintNegativeIntegers(int [] A)
	{
		System.out.println("Negative integers: ");
        for (int i : A) {
        	if (i < 0) {
                System.out.print(i + " ");
        	}
        }
    	System.out.println();
	}
	static void PrimeNumbers(int [] A)
	{
		System.out.println("Prime Numbers: ");
        for (int i : A) {
        	if (i >= 0) {
                System.out.print(i + " ");
        	}
        }
	}
	
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array: ");
//        int N = scanner.nextInt();
//
//        int[] A = new int[N];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < N; i++) {
//            A[i] = scanner.nextInt();
//        }
		int[] A = {10, -2, 3, 4, -5, 6, -7, 8, 9, 2, 5, 7, 11, 13, -17};
		
        PrintAllElements(A);
        PrintEvenIntegers(A);
        PrintOddIntegers(A);
        PrintPositiveIntegers(A);
        PrintNegativeIntegers(A);
	}
}