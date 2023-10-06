package com.practice.numbers;

import java.util.Scanner;

public class APowerOfB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number");
		int x = sc.nextInt();
		System.out.println("Enter the power number");
		int y = sc.nextInt();
		int power = y;
		sc.close();
		
		int result = 1;
//		while(y > 0 )
//		{
//			result *= x;
//			y--;
//		}
//		
		for(int i=1; i<=y; i++)
		{
			result *= x;
		}
		System.out.println(x+" power "+power+" : "+result);
	}

}
