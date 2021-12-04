package inheritance;

class Calc{     //SUPERCLASS OR PARENT CLASS OR BASE CLASS
	
	public int addition(int num1,int num2) {
		
	   return num1+num2;
	}
}

class AdvCalc extends Calc //SUB CLASS OR CHILD CLASS OR DERIVED CLASS//sub in java//child commonly in oops//derived and base in C.
//if its only two classes its called single level inheritance.Morethan two its multi level as the one given below
{
	
	public int subtraction(int num1,int num2) {
		
	   return num1-num2;
	}
}
class SupAdvCalc extends AdvCalc    //because of inheritance we do not need to type Calc and AdvCalc inside this
{                                   //all we had to do was to use extends keyword
	
	public int multiplication(int num1,int num2) {
		
	   return num1*num2;
	}
}



public class Inheritance2 {

	public static void main(String[] args) {
		SupAdvCalc value = new SupAdvCalc ();
		System.out.println(value.multiplication(8, 5));
		System.out.println(value.subtraction(8, 5));
		System.out.println(value.addition(8, 5));
	}

}
