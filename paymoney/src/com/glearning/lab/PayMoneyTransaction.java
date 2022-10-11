package com.glearning.lab;

import java.util.Scanner;

public class PayMoneyTransaction {
	// create the inputs
	static int size = 6;
	static int[] inputTransactions = new int[size];
	static int totalNumberOfTargets = 5;

	public static void main(String[] args) {
				
		System.out.println("Enter the target amount");
		Scanner sc = new Scanner(System.in);
		int targetValue = sc.nextInt();
		sc.close();

		int initialValue = 0;
		// do the initialization
		// initialize the array
		inputTransactions[0] = 20;
		inputTransactions[1] = 50;
		inputTransactions[2] = 31;
		inputTransactions[3] = 200;
		inputTransactions[4] = 46; 
		inputTransactions[5] = 12;
		/*
		 * boolean flag = true;
		 * 
		 * while(flag) { //write the logic to meet the transactions }
		 */
		// this statement will get executed
		int result = reachedTarget(initialValue, targetValue);
		if (result != -1) {
			System.out.println("Target achieved after " + result + " count");
		} else {
			System.out.println("Target was not achieved :: ");
		}
	}

	private static int reachedTarget(int initialValue, int targetValue) {
		int index = 0;
		while (initialValue < targetValue && index < size) {
			// base condition
			if (initialValue == targetValue) {
				// the index i was the break point
				System.out.println("Target reached after " + (index + 1) + " attempts");
				return index;
			}
			if (index >= totalNumberOfTargets) {
				System.out.println("Could not meet the target after the target count");
				break;
			}
			initialValue = initialValue + inputTransactions[index++];
		}
		if (initialValue > targetValue) {
			return index;
		}
		return -1;
	}
	
}
