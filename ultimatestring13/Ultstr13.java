package com.ultimatestring13;
import java.util.Scanner;

public class Ultstr13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		
	try{    
			String str ="hello";
		int i=Integer.parseInt(str);
		System.out.println(i);
		System.out.println("only digits");
		}
		catch(NumberFormatException n) {
			System.out.println("this has alphabets or characters");
		}
		
		
	}

}
