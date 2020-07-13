import org.omg.Messaging.SyncScopeHelper;

import java.util.*;

public class Demo_Test2 {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("zhangsan",23);
        map.put("zhangsan",24);
        map.put("wangwu",25);
        map.put("zhaoliu",26);
        boolean s1 = map.containsKey("zhangsan");
        boolean s2 = map.containsValue(26);
        Collection<Integer> c = map.values();
        System.out.println(s1);
        System.out.println(c);
        System.out.println(map.size());
        /*Set<String> ss = map.keySet();
        for (String key:map.keySet()
             ) {
            System.out.println(map.get(key));
        }*/
        Set<Map.Entry<String,Integer>> enteyset = map.entrySet();
        /*Iterator<Map.Entry<String,Integer>> it = enteyset.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> en = it.next();
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key + "=" + value);
        }*/
        for (Map.Entry<String,Integer> en:map.entrySet()
             ) {
            System.out.println(en.getKey() + "=" + en.getValue());
        }
    }
}
