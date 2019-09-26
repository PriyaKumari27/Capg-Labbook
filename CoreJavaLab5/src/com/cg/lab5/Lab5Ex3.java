package com.cg.lab5;
import java.util.Scanner;

public class Lab5Ex3 {

	public void prime(int n){
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if((i%j)==0) {
					count++;
					break;	
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}		

	}
	public static void main(String args[]) {
		Lab5Ex3 obj=new Lab5Ex3();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scanner.nextInt();
		obj.prime(n);

	}

}
