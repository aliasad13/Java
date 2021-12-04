package array;

 



public class ArrayDemo {

	public static void main(String[] args) {
	
	
		
		
		int nums[] = new int[4];//creating array    //if we already know the values to put in
												//then we can write int nums[] = {1,3,5,7} to insert values 
 
		
		
		nums[0]=1;
		nums[1]=3;
		nums[2]=5;
		nums[3]=7;
		
		nums[2]=13;    
		
		//USING FOR LOOP
		
		for(int i=0;i<4;i++)
		{	System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		//USE OF .LENGTH
		
		 int a[]= {1,2,3,4};{
		System.out.println("LENGTH IS "+a.length);
		}
		
		for (int j=0;j<a.length;j++ )
			
		{System.out.print(a[j]+" "); //when for loop is used a[i] is used for output
		}
		System.out.println();
		
		//ENHANCED FOR LOOP
		
		int b[]= {5,6,7,8};
		for(int e:b)  //first 5 goes to e,then 6 goes to e,then 7,then 8. 
		{
		System.out.print(e+" ");	//when enhanced for loop is used ,only e(enhanced variable) is used
			
		}
			
			
		}
	}


