import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//   将录入数据拷贝到文件代码实现

public class Demo_Test13 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("text.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要传入的数据：");
        while(true){
            String line = sc.nextLine();
            if("quit".equals(line))
                break;
            fos.write(line.getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
