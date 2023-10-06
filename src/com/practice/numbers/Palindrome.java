package com.practice.numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number :");
			int num = sc.nextInt();
			sc.close();
			
			int temp = num;
			int rev = 0;
			while(temp != 0)
			{
				rev = (rev * 10) + (temp % 10);
				temp = temp/10;
			}
			
			if(num == rev)
			{
				System.out.println(num+" is a Palindrome.");
			}
			else
			{
				System.out.println(num+" is not a Palindrome.");
			}

	}

}
