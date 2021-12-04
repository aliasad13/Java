package revision;

class A{
	int res;
	public void perform(int i,int j) {
		res=i+j;
		System.out.println(res);
	}
	
	
	public int perform(double a,double b) {   //method overloading
		return (int) ((int)a+b);
	}

}

public class Revision {

	public static void main(String[] args) {
		
				A obj =new A();
			obj.perform(5.4, 4.5);
			System.out.println(obj.perform(5.4, 4));
	}

}
