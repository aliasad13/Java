package com.armstrong;
import java.util.Scanner;


/*
 * 153=1*1*1  +  5*5*5  + 3*3*3
 */

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int n;
		
		System.out.print("enter the no : ");
		n=sc.nextInt();
		int temp=n;
		
		while (n>0) {
		int r =n%10;
		 n=n/10;
		
		 sum = sum + r*r*r;
		 
		 
		}
		if (temp == sum)
			System.out.println("yes");
		else {
			System.out.println("no");
		}
	}

}
