package com.bridgelbz;

import java.util.Scanner;

public class NumbersStoreInArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Index:");
		int index = input.nextInt();
		int numbers[] = new int[index];
		System.out.println("Insert values:");
		for (int i = 0; i < index; i++) {
			numbers[i] = input.nextInt();
		}

		ArrayLogic logic = new ArrayLogic();

		logic.storeArrays(numbers);
	}

}
