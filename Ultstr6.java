package com.ultimatestring6;
//find the no.of repeating letters//this can be done using hashmap;under hm.put(str,hm.get(str)+1);put count++;syso count
public class Ultstr6 {

	public static void main(String[] args) {
		String str = "independence";
		int len=str.length();
		int counti =0,countn=0,countd=0,counte=0,countp=0,countc=0;
		
		
		for (int i=0;i<=len-1;i++) {
			
			char j = str.charAt(i);
			if(j=='i') {
				counti++;
			}
			else if(j=='n') {
				
				countn++;
			}
	else if(j=='d') {
				
				countd++;
			}
	else if(j=='e') {
		
		counte++;
	}
	else if(j=='p') {
		
		countp++;
	}
	else {
		
		countc++;
	}

		
				
		}
		
		if(counte>=2) {
			System.out.println("e * "+counte);
		}if(counti>=2) {
			System.out.println("i * "+counti);
		}if(countn>=2) {
			System.out.println("n * "+countn);
		}if(countd>=2) {
			System.out.println("d * "+countd);
		}if(countp>=2) {
			System.out.println("p * "+countp);
		}
		if(countc>=2) {
			System.out.println("c * "+countc);
		}
		

	}

}
