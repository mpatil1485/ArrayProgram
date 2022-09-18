import java.util.Scanner;

public class substration {

public static void main (String ar[]) {
	
	Scanner sc= new Scanner(System.in);
	int i,j = 0;
	
	int A[][]=new int[3][3];      // Declaring 2D Array.
	int B[][]=new int[3][3];
	
	
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			System.out.print("\n\t Enter Value: ");
			A[i][j]=sc.nextInt();
		}
	}	
			System.out.print("\n\t********** Values of (A) 2D Array is**********\n\n\t");
			for(i=0;i<=2;i++)
			{
				
				for(j=0;j<=2;j++)
				{
					System.out.print(" "+A[i][j]);
					
				}
				System.out.print("\n\t");
			}
			
			for(i=0;i<=2;i++)
			{
				for(j=0;j<=2;j++)
				{
					System.out.print("\n\t Enter Value: ");
					B[i][j]=sc.nextInt();
				}
			}	
					System.out.print("\n\t********** Values of (B) 2D Array is**********\n\n\t");
					for(i=0;i<=2;i++)
					{
						
						for(j=0;j<=2;j++)
						{
							System.out.print(" "+B[i][j]);
							
						}
						System.out.print("\n\t");
						
					}
					    System.out.print("\n\t**********Subtraction of 3D Array**********\n\n\t");	
						int C[][] = new int[3][3];		
						for(i=0;i<3;++i)
						{
							
							for(j=0;j<3;++j)					

							{
								C[i][j]= A[i][j] - B[i][j];
								System.out.print(" "+C[i][j]);
								
							}
							
							System.out.print("\n\t");
						}
								
}}



