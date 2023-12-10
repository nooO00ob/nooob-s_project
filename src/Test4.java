import java.util.Arrays;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        Random random = new Random();
        Arrays.sort(arr, (a,b)->(random.nextBoolean()?1:-1));
        System.out.println(Arrays.toString(arr));
    }
}
