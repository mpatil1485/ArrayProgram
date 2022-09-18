import java.util.*; 

public class Ascending
{
    public static void main(String[] args)
    {
    int[] A= { 1, 3, 15, 5, 6, 8, 91, 10,110 };
    
      int temp=0;
      
      System.out.print("Original Array--->\n"+ Arrays.toString(A));
        
        for(int i=0; i<A.length; i++) {
            for(int j=i+1; j<A.length;j++) {
            	
            	if(A[i] > A[j])
				{
            	temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				
				}
            	
            }	
            System.out.print("\n Ascending order : " + A[i]);
        }
   
         
}
}