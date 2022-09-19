
import java.util.Arrays; 
public class RemoveElement {   
public static void main(String[] args) 
    {   
      
        int A[] = { 1,2,3,4,6,9,6,10,85}; 

        System.out.println("Original Array:" + Arrays.toString(A)); 
        int[] newArr = null;
        int remove = 2;
        
       
        for (int i = 0; i < A.length-1; i++) {
            if(A[i] == remove){
                newArr = new int[A.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = A[index];
                }
                for(int j = i; j < A.length - 1; j++){
                    newArr[j] = A[j+1];
                }
                break;
            }
        }
        
        System.out.println("\n After Remove Element : "   + remove +" \n " + Arrays.toString(newArr)); 
    } 
}
