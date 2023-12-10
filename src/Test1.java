import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;

public class Test1 {

    public static void main(String[] args) {
        String[] arr = new String[]{"123","123","123","123","55555","55555","55555","55555","33","33","11"};
        int n = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : arr){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        PriorityQueue<Object[]> queue = new PriorityQueue<>((Object[] a, Object[] b)->{
            if(a[1] != b[1]){
                return (Integer)b[1]-(Integer)a[1];
            }else{
                return ((String)a[0]).length() -((String)b[0]).length();
            }
        });
        for(String key : map.keySet()){
            queue.add(new Object[]{key, map.get(key)});
        }
        for(int i=0; i<n; i++){
            Object[] res = queue.poll();
            System.out.println(res[0] + "  " + res[1]);
        }

    }
}
