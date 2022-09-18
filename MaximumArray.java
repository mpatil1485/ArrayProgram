import java.util.Arrays;
public class MaximumArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,2,3333,4,5,566};
		
		int count;
		
		System.out.println("Array is => " + Arrays.toString(a));
		for(int i=0; i < a.length; i++)
		{
			for(int j=0;j< a.length; j++)
			{
				if(a[i]<a[j])
				{
				count = a[i];
				a[i] = a[j];
				a[j] = count;
				}
			}
		}
       System.out.print("Maximum Array Element is: " + a[a.length-1]);
	}

}
