package abstractclass;

class ShowNumber{


public int giveNumber(int i) {
	
	return i;
	
}

public double giveNumber(double i) {
	
	return i;
	
}
}
public class WhyAbstractClass {

	public static void main(String[] args) {
		ShowNumber obj = new ShowNumber();
		System.out.println(obj.giveNumber(1.5));

	}

}
