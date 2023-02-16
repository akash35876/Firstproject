package org.training;

import java.util.Scanner;

public class Numbers6 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");

		int j = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();

		int sum = j + k + l;

		System.out.println(sum);

		double average = sum /3;
		System.out.println(average);
	}

}
