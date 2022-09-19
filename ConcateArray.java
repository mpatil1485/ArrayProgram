
import java.util.Arrays;

public class ConcateArray {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int canaaary1 = array1.length;
        int conarray2 = array2.length;
        int[] result = new int[canaaary1 + conarray2];

        System.arraycopy(array1, 0, result, 0, canaaary1);
        System.arraycopy(array2, 0, result, canaaary1, conarray2);

        System.out.println("Concateing Array : "+Arrays.toString(result));
    }
}