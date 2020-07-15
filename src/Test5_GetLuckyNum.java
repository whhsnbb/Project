import java.util.ArrayList;

//-约瑟夫环，获取幸运数字

public class Test5_GetLuckyNum {

    public static void main(String[] args){
        System.out.println(GetLuckyNum(8));
    }

    public static int GetLuckyNum(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= num ; i ++ ){
            list.add(i);
        }
        int count = 1;
        for(int i = 0 ; list.size() != 1 ; i ++){

            if(i == list.size())
                 i = 0;
            if(count % 3 == 0) {
                list.remove(i);
                i--;
            }
            count ++;
        }
        return list.get(0);
    }
}
