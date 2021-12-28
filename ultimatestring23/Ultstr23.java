package com.ultimatestring23;

import java.lang.reflect.Array;
import java.util.Arrays;

//find the number closest to 0
public class Ultstr23 {

	public static void main(String[] args) {
		int[] k= {5,2,-1,-3,0}; 
		
		Arrays.sort(k);
		int j=k.length;
		for(int i=0;i<=j-1;i++)
		if(Array.getInt(k, i)==0) {
			
			System.out.println(i);
			break;
		}
		int left=Array.getInt(k, 1);
		int right=Array.getInt(k, 3);
		if (0-left<right-0) {
			System.out.println(left);
		}
		else {
			System.out.println(right);
		}
		
		}
		
	}


