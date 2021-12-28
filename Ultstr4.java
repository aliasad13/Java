package com.ultimatestring4;

import java.util.HashMap;

public class Ultstr4 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		String str="i love love object oriented oriented programming";
	String[] abc = str.split(" ");
	for(String name:abc) {
		
		if (hm.get(name)==null) {
			
			hm.put(name, 1);
		}
		else {
			
			hm.put(name, hm.get(name)+1);
		}
		
	}System.out.println(hm);
	
	for(int j=0;j<=abc.length-1;j++) {
		
		String pqr =abc[j];
		if (hm.get(pqr)>1) {
			
			System.out.println(pqr+","+hm.get(pqr));
			break;
		}
		}
		
	}
	
	}


