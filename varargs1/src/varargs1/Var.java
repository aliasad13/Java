package varargs1;

class Addition{
	int sum = 0;int diff=0;
	public int add(int ... i) {          //variable args are used to take any number of values and add or do other calculations
		for (int q:i) {
		sum = sum + q;
		}
		
		return sum;
	}
	
	public int sub(int ... j) {
		for (int t: j) {
			diff=diff-t;}
		return diff;
		
	}
	
}

public class Var {

	public static void main(String[] args) {
   Addition obj = new Addition();
   System.out.println(obj.add(5,6,4,5,6));
   System.out.println(obj.sub(5,6,4,5,6));
		
		
	}

}
