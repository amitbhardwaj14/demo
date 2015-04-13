package com.javaprograms;

import java.util.Scanner;

public class SwapToNumbers {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number ");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number ");
		int b = scanner.nextInt();
		System.out.println("Before Swapping  a =" +a+" and b =" +b);
		int c = a;
		a=b;
		b=c;
		System.out.println("After Swapping a ="+a+" and b = "+b+ "result");
		
	}

}
