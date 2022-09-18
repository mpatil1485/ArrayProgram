import java.util.*;
public class MinimumArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,2,3333,4,5,566};
		
		int compair;
		
		System.out.println("Array is => " + Arrays.toString(a));
		for(int i=0; i < a.length; i++)
		{
			for(int j=0;j< a.length; j++)
			{
				if(a[i]<a[j])
				{
				compair = a[i];
				a[i] = a[j];
				a[j] = compair;
				}
			}
		}
       System.out.print("Minimum Array Element is: " + a[0]);
	}

}
