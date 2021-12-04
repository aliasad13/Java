package com.scanner;

import java.util.Scanner;

public class Scannr{

	
	                                         //fault on if condition
public static void main(String[] args) {
		double n;double m;
		
	    Scanner sc = new Scanner(System.in);
	
	
		System.out.print("enter the first number here : ");
		n = sc.nextDouble();
		
		System.out.print("enter the 2nd no here : ");
		m = sc.nextDouble();
		
		
		double k = n+m;
		System.out.print(k);
	
}

}
