package com.practice.numbers;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for reversal : ");
		int n = sc.nextInt();
		sc.close();
		int rev = 0;
		
		while(n > 0)
		{	
			rev = rev * 10 + n % 10;
			n = n/10;
		}
		System.out.println("Reversed number : "+rev);
	}

}
