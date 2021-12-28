package com.ultimatestring5;

import java.util.HashMap;
//how many time a char repeats for a given word
public class Ultrstr5 {

	public static void main(String[] args) {
		
		String bdc="Samseena";
		String str=bdc.toLowerCase();
		HashMap<String,Integer> hm = new HashMap<>();
		int len = str.length();
		
		String[] ch=str.split("");
		int count=0;
		
		
		for(String j:ch) {
			if (hm.get(j)==null) {
		hm.put(j, 1);
		count++;}
			else {
				hm.put(j,hm.get(j)+1);
			count++;
			
			}
			
		             
		}
		for (String j:ch) {
			if(hm.get(j)==1) {
				System.out.println(j);
			break;
			}
			
		}
		
		System.out.println(count);
		System.out.println(hm);
		
		
		
			
			
			
		}

	}


