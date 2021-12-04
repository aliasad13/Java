package com.accessModifier.anonymous;
class A{

public void takeNo(){
	
	int i=2;int j=3;
	System.out.println(i+j);
} 

public int result(int i,int j) {
	return i+j;
}
}

//default class only inside package
public class AccessmodiferTest {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.takeNo();
		System.out.println(obj.result(5,6 ));
		
		
		Access1 roll=new Access1();    //variable accessed from another class of same package.
									   //If we use another package we will have to use public int rollno=15; while declaring it.
		int rollno = 12;			   //else we cant access.
		System.out.println(rollno);
		
	}

}
