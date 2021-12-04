package variablearguments;
class Addition{
	public int perform(int...d) {       //int d acts like an array that takes all the nos that we enter{4,5,6,7}                        
		int sum=0;
		for  (int e : d)    //e takes 1st value from d,gives it to sum,goes back and takes the 2nd value and add it to sum
		{
			sum=sum+e;
		}
		return sum;
	}
}

public class VarArgs2 {

	public static void main(String[] args) {
		
		Addition obj=new Addition();
		  
		
		System.out.println(obj.perform(4,5,6,1));

	}

}
