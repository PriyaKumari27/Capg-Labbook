package com.cg.Lab4;
import java.util.Scanner;

public class Cube {

	public static int getCube(int num) {
		int cube=0;
		while(num>0) {
			int temp=num%10;
			cube+=(temp*temp*temp);
			num=num/10;	
		}
		return cube;
	}
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int input=scanner.nextInt();
		System.out.println(getCube(input));
		scanner.close();
	}

}



