import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Demo_Test6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        while(true) {
            String line = sc.nextLine();
            try{
                int m = Integer.parseInt(line);
                System.out.println(Integer.toBinaryString(m));
                break;
            }catch(Exception e){
                try {
                    new BigInteger(line);
                    System.out.println("录入整数过大，请重新录入一个整数：");
                }catch(Exception e1){
                    try{
                        new BigDecimal(line);
                        System.out.println("录入的是一个小数，请重新录入一个整数：");
                    }catch(Exception e2){
                        System.out.println("录入的是非法字符，请重新录入一个整数：");
                    }
                }
            }

        }
    }
}
