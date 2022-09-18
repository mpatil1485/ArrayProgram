import java.util.*; 
public class AddingElementInArray {   
public static void main(String[] args) 
    {   
      
        int A[] = { 1,2,3,4,6,9,6,10,85}; 

        System.out.println("Original Array:" + Arrays.toString(A)); 

        // element to be added at index
        int element = 99; 
        int index = 3;
        
       
        int[] B = new int[A.length+1];
        int j = 0;
        
        //insert new element as well as shift other elements to the right
       
        for(int i = 0; i <B.length; i++) {
        if(i == index) {
            B[i] = element;
             }
             else {
                   B[i] = A[j];
                   j++;
             }
        }
        
       // display new Array
        System.out.println("\n New Array after adding element " + element + " at index " + index +":" + Arrays.toString(B)); 
    } 
}
