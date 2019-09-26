package com.cg.corejavalab1;

import java.util.Scanner;

public class IncreasingNumber {
	
	public static boolean checkNumber(int num) {
		int rem = num%10;
		num = num/10;
		while(num>0)
		{
			int b= num%10;
			if(rem<b)
				return false;
			rem= b;
			num = num/10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the number");
		int input = scanner.nextInt();
		System.out.println(checkNumber(input));
		scanner.close();
	}

}
