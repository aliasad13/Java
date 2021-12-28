package com.ultnumber14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Closestozero {
	int m=0;

	public static void main(String[] args) {
		int[] n= {-1,-2,0,2,3};
		int count=0;
		
		Arrays.sort(n);
		//{-2,-1,0,1,2}
       int i;
       
 for(i=0;i<=n.length;i++) {
	 if(n[i]!=0) {
		 count++;
	 }else {break;}
	 System.out.println(count);
	 if(0-(n[count-1])>n[count+1]-0) {
		 System.out.println(n[count-1]);}
		 else {
			 System.out.println(count+1);
		 }
	 }
 }
       }
	


