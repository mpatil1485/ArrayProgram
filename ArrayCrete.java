import java.util.Scanner;

public class ArrayCrete {

	static Scanner sc= new Scanner(System.in);
	
	public static void main (String args[]) {
		
		int r[]=new int[5]; //Declaring Array
		int i;
		
		//Storing values into an Array.
		
		for(i=0;i<=4;i++)
		{
			System.out.print ("Enter Value:");
			r[i]= sc.nextInt();
		}
		
		//Displaying/Reading Values from Array.
		
		for(i=0;i<=4;i++) {
		System.out.println("Value is "+r[i]);
		}
		
		
		}
	}

