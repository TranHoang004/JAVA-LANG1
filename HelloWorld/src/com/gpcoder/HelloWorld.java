package com.gpcoder;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Input a: ");
			int a = scanner.nextInt();
			System.out.println("Input b: ");
			int b = scanner.nextInt();
			if (a>b)
			System.out.println(" a > b");
			if (b>a)
			System.out.println(" b < a");
			else
			System.out.println(" a = b");
		}
	}
}
