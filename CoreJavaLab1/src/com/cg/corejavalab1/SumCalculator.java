package com.cg.corejavalab1;

import java.util.Scanner;

public class SumCalculator {
	
	static int number;
	public static int calculateSum(int num){
		int sum=0;
		for(int k=1;k<=num;k++){
			if(((k%3)==0)||((k%5)==0))
			{
				sum=sum+k;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=scanner.nextInt();
		int sum=calculateSum(number);
		System.out.println(sum);
		scanner.close();
		
	}


}
