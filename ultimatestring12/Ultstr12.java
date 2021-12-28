package com.ultimatestring12;

import java.util.HashMap;

public class Ultstr12 {

	public static void main(String[] args) {
		
		
	HashMap	<Character,Integer> hm = new HashMap<>();
	String name = "Samseena";
	String str=name.toLowerCase();
	
	int len=name.length();
	
	for(int i=0;i<=len-1;i++) {
		char c=str.charAt(i);
		if (hm.containsKey(c)) {
		hm.put(c, hm.get(c)+1);
	}
		else {
			hm.put(c, 1);
			
		}
	}	
	System.out.println(hm);
	
	for(int j=0;j<=len-1;j++) {
		char c=str.charAt(j);
		if (hm.get(c) == 1) {
			System.out.println(c);
			break;
		}
		
		
	}
		
	}

}
