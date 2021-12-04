package assnmnts;
/*
 * 12345    *****
 * 1   5 or *   *
 * 1   5    *   *
 * 1   5    *   *
 * 12345    *****
 */

public class Assignment7 {

	public static void main(String[] args)  {
		int n=5;
		for (int i=1;i<=n;i++)
		
		{
			for(int j=1;j<=n;j++)
			{
			if (j==1||i==1||j==n||i==n)
			{System.out.print(j);}
			else
			{System.out.print(" ");}
			}
			System.out.println();
		}
		
					

	}

}
