import java.util.*;

public class TwoDArray {

	public static void main (String ar[]) {
		
		Scanner sc= new Scanner(System.in);
		int i,j;
		
		int a[][]=new int[3][3];      // Declaring 2D Array.
		
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print("\n\t Enter Value ");
				a[i][j]=sc.nextInt();
			}
		}	
				System.out.print("\n\t********** Values from 2D Array is**********\n\n\t");
				for(i=0;i<=2;i++)
				{
					
					for(j=0;j<=2;j++)
					{
						System.out.print(" "+a[i][j]);
						
					}
					System.out.print("\n\t");
				}
			}
		}
		
	

