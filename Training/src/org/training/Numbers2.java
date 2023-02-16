package org.training;

import java.util.Scanner;

public class Numbers2 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("ENter the numbers");

		int a = sc.nextInt();
		int b = sc.nextInt();

		int n = a * b;
		System.out.println(a + "x" + b + "=" + n);
	}

}
