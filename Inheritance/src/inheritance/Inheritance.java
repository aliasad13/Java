package inheritance;

class Add{
	
	public int addition(int num1,int num2)
	{
	return num1+num2;	
		
	}
}

class AddSub{
	public int addition(int num1,int num2)
	{
	return num1+num2;	
		
	}
	
	public int sub(int num1,int num2)
	{
		return num1-num2;
		
	}
	
}

class AddSubMul{
	public int addition(int num1,int num2)
	{
	return num1+num2;	
		
	}
	
	public int sub(int num1,int num2)
	{
		return num1-num2;
		
	}
	
	
	public int addsubmult(int num3,int num4)
	{
	return num3*num4;	
		
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
			
		AddSubMul obj=new AddSubMul();
		
	    System.out.println(obj.addition(5,4 ));
	    System.out.println(obj.sub(5,3));
	    System.out.println(obj.addsubmult(6, 8));
	}
	
	

}//THE NEXT PROGRAM IN THIS PROJECT WILL TELL HOW TO DO THIS EASILY WITH INHERITANCE
  //THE EXPLANATION ON WHY INHERITANCE WILL BE GIVEN IN NOTEBOOK


