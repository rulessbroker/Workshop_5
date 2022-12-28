package com.bridgelbz;

import java.util.ArrayList;
import java.util.List;

public class ArrayLogic {

	public void printArrays() {

	}

	public void storeArrays(int[] num) {
		List<Integer> divByTwo = new ArrayList<>();
		List<Integer> divByFive = new ArrayList<>();
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				divByTwo.add(num[i]);
			} if (num[i] % 5 == 0) {
				divByFive.add(num[i]);
			} if (num[i] % 2 != 0 && num[i] % 5 != 0) {
				System.out.println("Not devisible : " + num[i]);
			}
		}
		System.out.println("\nDivisible by 2");
		for (int divicibleByTwo : divByTwo) {
			System.out.print(divicibleByTwo + " ");
		}

		System.out.println("\n\nDivisible by 5");
		for (int divicibleByFive : divByFive) {
			System.out.print(divicibleByFive + " ");
		}
	}
}
