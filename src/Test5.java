import java.util.HashMap;

public class Test5 {

    public static void main(String[] args) {
        int P = 13131;
        String[] strs =  new String[]{"111","111","aaa","abc","dfs","abc","ewftrwef","nhyertge"};
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Integer> cnts = new HashMap<>();
        for(String str : strs){
            int len = str.length();
            int hash = 0;
            for(int i=0; i<len; i++){
                char c = str.charAt(i);
                hash = hash * P + c;
            }
            map.put(hash, str);
            cnts.put(hash, cnts.getOrDefault(hash, 0)+1);
        }

        for(int key : cnts.keySet()){
            System.out.println(cnts.get(key)+"  "+map.get(key));
        }

    }
}
