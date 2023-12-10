import java.util.*;

import static java.util.Objects.hash;

public class Main {
    public static void main(String[] args) {
//        HashSet<Character> set1 = new HashSet<>();
//        HashSet<Character> set2 = new HashSet<>();
//        HashSet<Character> res = new HashSet<>();
//        ArrayList<Character> list = new ArrayList<>();
//        System.out.println(list);
//        int[] aa = new int[]{1,2,3};
//        LinkedList<Integer> queue = new LinkedList<>();
//        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->(a[1]-b[1]));
//        heap.add(new int[]{1,2});
//        heap.add(new int[]{1,3});
//        heap.add(new int[]{1,1});
//        TreeSet<Integer> ts = new TreeSet<>();
//        List l = new ArrayList<Integer>();
//        l.add("A");
//        System.out.println(l.get(0));
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(1,66);
//        map.put(2,44);
//        map.put(3,33);
//        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
//        System.out.println(arr);
//        Collections.sort(arr);
        int a = 13131;
        int b = 1;
        for(int i=0; i<10; i++){
            b *= a;
            System.out.println(b);
        }
        long c = (long)Math.pow(a,7);
        System.out.println(b);
        System.out.println(c);

    }
}