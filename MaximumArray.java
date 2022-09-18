import java.util.Arrays;
public class MaximumArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,2000,3202,50,3333,4,5,566};
		
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
       System.out.print("Maximum Array Element is: " + a[a.length-1]);
	}

}
