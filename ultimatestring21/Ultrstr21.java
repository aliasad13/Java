package com.ultimatestring21;
import java.util.Arrays;
import java.util.HashMap;
//program to find the first non repeating/repeating word from a sentence
public class Ultrstr21 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
			String str="welcome welcome to to to ooty nice to meet meet you you you" 	;
			String[] abc=str.split(" ");
			String d=Arrays.toString(abc);
			System.out.println(d);
			
		for(String word:abc) {
				if(hm.get(word)==null) {
					hm.put(word, 1);
					}
				else {
					
					hm.put(word, hm.get(word)+1);
					
				}
				
		} System.out.println(hm);
		
		for(String word:abc) {
			if(hm.get(word)==1) {
				
				System.out.println(word);
				break;
			}
			
			
		}
		
	}

}
