package com.ultimatestring19;


import java.util.HashMap;
//program to find the first non repeating char(hm.get(abc)==1)/repeating once(==2)/repeating twice(==3,repeating thrice,...) 
public class Ultstr19 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		String name="Samseena";
		String str=name.toLowerCase();
		
		String[] split=str.split("");
		int len=str.length();
		
		for(String abc:split) {
			if(hm.get(abc)==null) {
				
				hm.put(abc, 1);
			}
			else {
				
				hm.put(abc,hm.get(abc)+1);
				
			}
			
		}
		System.out.println(hm);
		
		for (String abc:split) {
			if(hm.get(abc)==1) {
				System.out.println(abc);
				break;
			}
			
		}
		
	
			}
			
		

	}


