import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Demo_Test4 {
    public static void main(String[] args){
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color = {"黑桃","方片","梅花","红桃"};
        int index = 0;
        HashMap<Integer,String> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (String s1:num
             ) {
            for (String s2:color
                 ) {
                hm.put(index,s2.concat(s1));
                list.add(index);
                index++;
            }

        }
        list.add(index);
        hm.put(index,"小王");
        index++;
        list.add(index);
        hm.put(index,"大王");
        Collections.shuffle(list);
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        for (int i = 0 ; i<list.size();i++) {
            if(i>=list.size()-3)
                dipai.add(list.get(i));
            else if(i%3 == 0) {
                player1.add(list.get(i));
            }else if(i%3 == 1) {
                player2.add(list.get(i));
            }else{
                    player3.add(list.get(i));
            }
        }
        print1(hm,player1,"Player1");
        print1(hm,player2,"Player2");
        print1(hm,player3,"Player3");
        print1(hm,dipai,"dipai");

    }
    public static void print1(HashMap<Integer,String> hm,TreeSet<Integer> ts,String name){
        System.out.println(name + "的牌是");
        for (Integer i:ts
             ) {
            System.out.print(hm.get(i)+" ");
        }
        System.out.println();
    }
}
