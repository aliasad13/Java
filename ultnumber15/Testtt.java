package com.ultnumber15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Testtt {

	public static void main(String[] args) {
		String[] number = {"45","876"};
		String str="";
		int rem=0;
		int h=0;
		int f=0;
		for(String abc:number) {
			str=str+abc;
			
		}
		System.out.println(str);
		int num=Integer.parseInt(str);
		System.out.println(num);
		int len=str.length();
		System.out.println(len);
		int[] a= new int[len];
		
		while (num>0) {
			
			
			for(int i=len-1;i>=0;i--) {
				rem=num%10;
				num=num/10;
			a[i]=rem;
				
			}
			
		}System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	
		
		for(int x=len-1;x>=0;x--){
		f=Array.getInt(a, x);                  //int a=Array.getInt(a,0);=4
												//int a=Array.getInt(a,1);=5					
		System.out.print(f);					//int a=Array.getInt(a,2);=6			
		
		}
		
	}

}
