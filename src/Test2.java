import java.util.Arrays;

public class Test2 {

        public static void qkSort(int[] arr, int low, int high){
            if(low>high){
                return;
            }
            System.out.println(low+"  "+high);
            System.out.println(Arrays.toString(arr));
            int i = low;
            int j = high;
            int midVal = arr[low];
            while(i<j){
                while(arr[j] >= midVal && i < j){
                    j--;
                }
                while(arr[i] <= midVal && i < j){
                    i++;
                }
                if(i < j){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            arr[low] = arr[i];
            arr[i] = midVal;
            qkSort(arr, low, j-1);
            qkSort(arr, j+1, high);
        }

        public static int[] mrSort(int[] arr, int low, int high){
            if(low == high) return new int[]{arr[low]};
            int mid = low + (high - low)/2;
            int[] leftArr = mrSort(arr, low, mid);
            int[] rightArr = mrSort(arr, mid+1, high);
            int[] res = new int[high-low+1];
            int i = 0, j = 0, idx = 0;
            while(i < leftArr.length && j < rightArr.length){
                if(leftArr[i] < rightArr[j])
                    res[idx++] = leftArr[i++];
                else
                    res[idx++] = rightArr[j++];
            }
            while (i < leftArr.length){
                res[idx++] = leftArr[i++];
            }
            while (j < rightArr.length){
                res[idx++] = rightArr[j++];
            }
            return res;
        }


        public static void main(String[] args){
            int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
            int[] res = mrSort(arr, 0, arr.length-1);
            qkSort(arr, 0, arr.length-1);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(res[i]);
                System.out.println(arr[i]);
                System.out.println(" ");
            }
        }

}
