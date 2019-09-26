package com.cg.lab5;
import java.util.Scanner;

public class Lab5Ex1 {



	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Red or Yellow or Green to check Signal");
		String str=scanner.nextLine();
		switch(str) 
		{
		case "Red": 
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default: 
			System.out.println("Wrong Choice");
		}

	}

}



