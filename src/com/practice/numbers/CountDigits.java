package com.practice.numbers;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		int count = 0;
		int originalNum = num;
		
		while(num > 0)
		{
			num = num / 10;
			count++;
		}
		
		System.out.println("The number of digits in "+originalNum+ " is "+count);

	}

}
