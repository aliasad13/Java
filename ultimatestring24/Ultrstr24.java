package com.ultimatestring24;
//stop after 5 char after reversing

public class Ultrstr24 {

	public static void main(String[] args) {
		
		
		String name ="samseena";
		int len = name.length();
		int count=0;
		String rev="";
		for (int i=len-1;i>=0;i--) {
			
			char d= name.charAt(i);
			rev=rev+d;
			count++;
	if (count==5) {
		System.out.println(rev);
		break;
		
	}
			
		}
	}

}
