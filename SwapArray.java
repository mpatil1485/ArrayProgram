import java.util.Arrays;

public class SwapArray {
	
    public static void main(String[] args) {
    	
    	int[] array1 = new int[] {1,2,6,4,9,15};  
        System.out.println("Array before Swap : " +Arrays.toString(array1));
        
        int temp = array1[1];
        array1[1] = array1[2];
        array1[2] = temp;
        System.out.println("\n" + "After Swapping Frist Array Swap into Second Array : " + Arrays.toString(array1));
        
    }
}