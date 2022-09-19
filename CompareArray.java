import java.util.Arrays;  
public class CompareArray  
{   
	public static void main (String[] args)    
	{   
		int[] array1 = new int[] {1,2,6,4,9,15};   
		int[] array2 = new int[] {1,2,6,4,9,15};  
		int[] array3 = new int[] {10,20,30,40,50};
	    int[] array4 = new int[] {15,25,35,45,55};
		
		if (Arrays.equals(array1, array2))   {
			System.out.println("1 and 2 Arrays are equal");   
		}
		else  {
			System.out.println("1 and 2 Arrays are not equal");   
		}
		System.out.print("\n");
		
		if (Arrays.equals(array3, array4))   {
			System.out.println("3 and 4 Arrays are equal");   
		}
		else  {
			System.out.println("3 and 4 Arrays are not equal");   
		}
		
	}   
}  