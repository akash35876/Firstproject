package org.training;

import java.util.Scanner;

public class Swapnumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("After swap");

		m = m + n;
		n = m - n;
		m = m - n;

		System.out.println(m);
		System.out.println(n);

	}

}
