package com.rush.array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size for 1st demenssion ");
		int firstDimenssion = scanner.nextInt();
		System.out.println("Enter the size 2nd dimenssion ");
		int secondDimession = scanner.nextInt();

		int[][] twoD = new int[firstDimenssion][secondDimession];
		

		for (int i = 0; i < firstDimenssion; i++) {
			for (int j = 0; j < secondDimession; j++) {
				System.out.println("Enter the element in twoD[ " + i + " ][" + j + " ]");
				twoD[i][j] = scanner.nextInt();
			}

		}

		System.out.println("Array Elment");
		for (int i = 0; i < firstDimenssion; i++) {
			for (int j = 0; j < secondDimession; j++) {
				System.out.println("  twoD[ "+i+" ]["+j+" ] = "+twoD[i][j]);
				
			}
	}}
}
