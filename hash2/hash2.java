package com.hash2;

import java.util.Arrays;
import java.util.HashMap;

public class hash2 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>(); 
		String str = "I love love love object oriented oriented programming";
        String abc = str.toLowerCase();
        String[] word = abc.split(" ");
        int count=0;
        int countc=0;
for (String ab : word) {
	if(hm.get(ab)==null) {
	hm.put(ab, 1);
	count++;
	}
	
	else if (hm.get(ab)==1){
		
		hm.put(ab,hm.get(ab)+1);
		count++;
		
		
	}
	else {
		
		hm.put(ab,hm.get(ab)+1);
		System.out.println(ab+" "+hm.get(ab));
	}
	
}   System.out.println(hm);  
System.out.println(count);

	}

}
