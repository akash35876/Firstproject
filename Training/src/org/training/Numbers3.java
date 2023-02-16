package org.training;

import java.util.Scanner;

public class Numbers3 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("ENter the numbers");

		int a = sc.nextInt();
		int b = sc.nextInt();

		int n = a + b;
		int m = a - b;
		int k = a * b;
		int l = a / b;
		int c = a % b;

		System.out.println(a + "+" + b + "=" + n);
		System.out.println(a + "-" + b + "=" + m);
		System.out.println(a + "*" + b + "=" + k);
		System.out.println(a + "/" + b + "=" + l);
		System.out.println(a + "%" + b + "=" + c);
	}

}
