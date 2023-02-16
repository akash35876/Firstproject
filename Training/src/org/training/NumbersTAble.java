package org.training;

import java.util.Scanner;

public class NumbersTAble {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		int a = sc.nextInt();
		int mul =1;
		
		
		for(int i=1; i<=10; i++) {
			
			mul= a*i;
			
			System.out.println(a+"x"+i+"="+mul);
		}
	}

}
