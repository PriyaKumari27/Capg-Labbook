package com.cg.corejavalab1;

import java.util.Scanner;

public class DifferenceCalculator {
	
		static int num;
		public static int calculateDifference(int n){
			int sum=0;
			int squaresum=0;
			for(int i=1;i<=n;i++){
				sum=sum+i;
			}
			for(int k=1;k<=n;k++){
				int temp=k*k;
				squaresum=squaresum+temp;
			}
			return squaresum-sum;
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=scanner.nextInt();
		int diff=calculateDifference(num);
		System.out.println(diff);
		scanner.close();
		
	}

}
