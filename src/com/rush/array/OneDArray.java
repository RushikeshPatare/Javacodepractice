package com.rush.array;

import java.util.Scanner;

public class OneDArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the array size");

		int size = scanner.nextInt();

		int[] a = new int[size];
		// read array values
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value for array index a[" + i + "]");
			a[i] = scanner.nextInt();
		}
		// Write array element

		for (int i = 0; i < a.length; i++) {
			System.out.println("Array value for index " + i + " is " + a[i]);
		}

	}
}
