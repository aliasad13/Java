package com.ultimatestring7;

import java.util.Arrays;

//string to character//convert the string into charArray
public class UltStr7 {

	public static void main(String[] args) {
		String s1 = "abcd";
		char[] c=s1.toCharArray();
		System.out.println(Arrays.toString(c));
		for(char s2:c) {
			
			System.out.print(s2);
		}
	}

}
