package com.ultimatestring10;
//first repeating char without hashmap
public class Ultstr10 {

	public static void main(String[] args) {
		String name = "Samseena";
		String abc=name.toLowerCase();
		int len =abc.length();
		
		for (int i=0;i<=len-1;i++) {
			
			char d=abc.charAt(i);
			
			for(int j=0;j<=len-1;j++) {
				
				char e = abc.charAt(j);
				
				if(i!=j && e==d ) {
					System.out.println(e);
					System.exit(e);
					
				}
				else {
					
				}
				
			}
			
		}
	}

}
