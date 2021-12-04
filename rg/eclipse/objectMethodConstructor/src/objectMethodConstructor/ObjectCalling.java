package objectMethodConstructor;
class Calc{
	int  num1=10,num2=11;  
	int result;
	 
	public void perform() { //Actions and operations are always performed
							//inside method()	
	
		result = num1 - num2;
	}
}
public class ObjectCalling {

	public static void main(String[] args) {
					Calc obj;//reference or referring from Calc class
					obj = new Calc();// Calc() here is the constructor whose duty
									 //is to create space inside heap memory 
									//for the new object			
					obj.num1=3;//value of num1 here is 3 but at
								//but in class Calc it is 10. the thing
					obj.num2=5;//is we're only taking the variable num1 and not he value
								//the value of the variable can be different
								//in different class
					obj.perform();
		System.out.print(obj.result);
	}

}
