package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Find a pair with the given sum in an array
 * eg:- 
 * Input : arr = [8, 7, 2, 5, 3, 1], target = 10
 * Output: (8, 2) or (7,3)
 */

public class FindPair {
	
	//1. Brute-force
	public static void findPairUsingBruteForce(int arr[], int sum) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == sum) {
					System.out.printf("The pair is (%d, %d)",arr[i], arr[j]);
					return;
				}
			}
			
		}
		
		System.out.println("Pair not found");
	}
	
	//2. Sorting
	public static void findPairUsingSorting(int arr[], int sum) {
		Arrays.sort(arr);
		
		int low=0;
		int high=arr.length-1;
		
		while(low < high) {
			if(arr[low] + arr[high] == sum) {
				System.out.printf("The pair is (%d, %d)", arr[low], arr[high]);
				return;
			}
			
			if(arr[low]+arr[high] < sum) {
				low++;
			}
			else {
				high--;
			}
		}
		System.out.println("Pair not found");
	}
	
	//3. Hashing
	public static void findPairUsingHashing(int arr[], int sum) {
		System.out.println("Pair not found");
	}
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		int target=0;
		int selection=0;
		
		System.out.println("FIND A PAIR WITH THE GIVEN SUM IN AN ARRAY");
		
		System.out.println("Enter 6 elements for the array:");
		for(int i=0; i<6; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the sum you want to find pair for :");
		target = sc.nextInt();
		
		while(true) {
			System.out.println("\n Which method do you want to use ?");
			System.out.println("1. Brute-force");
			System.out.println("2. Sorting");
			System.out.println("3. Hashing");
			System.out.println("4. Exit");
			selection = sc.nextInt();				
			
			switch(selection) {
				case 1: System.out.println("\nBRUTE-FORCE");
						FindPair.findPairUsingBruteForce(arr, target);
					break;
				case 2: System.out.println("\nSORTING");
						FindPair.findPairUsingSorting(arr, target);
					break;
				case 3: System.out.println("\nHASHING");
						FindPair.findPairUsingHashing(arr, target);
					break;
				case 4: System.out.println("\nThank you..!!");
					break;
				default : System.out.println("\nInvalid Input");
			}
			if(selection == 4) {
				sc.close();
				break;
			}
		}
	}
	
}
