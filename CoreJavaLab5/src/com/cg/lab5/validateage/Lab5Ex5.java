package com.cg.lab5.validateage;
import java.util.Scanner;

public class Lab5Ex5 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		try {
			if(age<=15)
				throw new ValAgeException("Fine");
			else
				System.out.println("Age : "+age);
		}catch(ValAgeException e) {
			System.out.println("Age of a person should be above 15.");
		}
	}
}



