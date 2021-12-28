package com.ultnumber15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Number2 {

	public static void main(String[] args) {
		String[] abc= {"356","98"};
	String k=	(String) Array.get(abc, 0)  ;String l=(String) Array.get(abc, 1);
System.out.println(k+l);
String hml=k+l;
int len=hml.length();
System.out.println(len + " len");

int i = Integer.parseInt(k+l);
System.out.println(i);

int rem=0;
int[] s = new int[len];

while (i>0) {
	

	for (int j=len-1;j>=0;j--) {
		rem=i%10;
		i=i/10;
		s[j]=rem;
	}
	
} 
System.out.println(Arrays.toString(s));

Arrays.sort(s);
System.out.println(Arrays.toString(s));

while(len>0) {
int a =Array.getInt(s, len-1);
len--;
System.out.print(a);
}




	}

}