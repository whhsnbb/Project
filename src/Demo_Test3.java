import java.util.HashMap;

public class Demo_Test3 {
    public static void main(String[] args){
        String s = "aaaabbbbbbcccccccccc";
        char[] array = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char c:array) {
            hm.put(c , !hm.containsKey(c) ? 1 : hm.get(c) + 1);
        }
        for (Character c:hm.keySet()) {
            System.out.println(c + "=" + hm.get(c));
        }
    }
}
