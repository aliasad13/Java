package com.hash3;

import java.util.Arrays;
//for strings we donot use (if (abc = bcd),) we use if(abc.equals(bcd)
//how many times each word repeats without hashmap or how many times a specific word repeats

public class Abc{
public static void main(String[] args) {
	
    String name = "i love love object object object oriented programming";
   String[] split=name.split(" ");
  int len = split.length;
  int counto=0;
  int countl=0;
  for(int i=0;i<=len-1;i++) {
	  
	  String abc=split[i];
	  
	  if (abc.equals("object")) {
		  counto++;
	  }
	  else if(abc.equals("love")) {
		  countl++;
		  
	  }
	  
  }System.out.println(counto);
  	System.out.println(countl);
}
}