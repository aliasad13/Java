package com.prime;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no here: ");
		int n=sc.nextInt();
		
	{
		int i=2;
		for ( i=2;i<=n-1;i++) {
			
			if(n%i==0) {
				
				System.out.println(n+" is not prime");
				break;}
			
				else {
					System.out.println(n+" is prime");
					break;}
					
		}
}
			}
		
	}
	

	


