package com.ultimatestring3;

public class Utstring3 {
	//place of a letter in a string
	public static void main(String[] args) {
		String str="Anurag";
		String abc=str.toLowerCase();
		//anurag
			
		int count =0;
		int len= str.length();
		
		for (int i =0;i<=len-1;i++) {
			
			char j =abc.charAt(i);
			if (j!='u') {
				count++;
				
			}
			if (j=='u') {
				break;
				
			}
		}
		System.out.println(count);

	}

}
