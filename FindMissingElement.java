import java.util.*; 
public class FindMissingElement
{
    public static void main(String[] args)
    {
    int[] A= { 1, 2, 3, 4, 5, 6, 8, 9, 10,11 };
    
      
        int N = A.length+1;
 
        int total = (N * (N + 1) / 2);
        
        int i=0;
        int sum=0;
        int num;
        
        for( i=0; i<A.length; i++) {
            sum = sum+A[i];
        }
 
        num= total - sum;
   
         System.out.print("The missing number is : " + num);
}
}