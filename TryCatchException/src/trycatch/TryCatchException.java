package trycatch;

public class TryCatchException {

	public static void main(String[] args) {
		int i=12,j=2;
		try{double res=i/j;
		System.out.println("res is " + (int)res);}  //how to make double answer int  //if the try statement has error,it will immediately jump onto statment of catch
													   //if no error the statement of try will be executed. 
		catch (Exception e)
		{System.out.println("ok beii");
		}
		
		finally {                            //the statement in finally will execute regardless of try or catch
			System.out.println("thank you");
		}
		;
	}

}
