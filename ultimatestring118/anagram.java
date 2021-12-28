package com.ultimatestring118;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String a="abc";
		String b="bca";
		
		String[] word1=a.split("");
		String[] word2=b.split("");
		
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		System.out.println(Arrays.toString(word1));
		System.out.println(Arrays.toString(word2));
		
		
		if(Arrays.equals(word1, word2)) {                       //to check if two arrays are equal;if(Arrays.equals(array1,array2))
			
			System.out.println("anagram");						//to check if 2 strings are equal;if(str1.equals(str2));
		}
		else {
			System.out.println("not anagram");
		}
	}

}
