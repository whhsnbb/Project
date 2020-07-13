import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//JDK1.7版本后流的标准异常处理代码

public class Demo_Test11 {
    public static void main(String[] args) throws IOException {
        try(
                FileInputStream fis = new FileInputStream("aaa.txt");
            FileOutputStream fos = new FileOutputStream("bbbb.txt");
        ){
            int b;
            while((b = fis.read()) != -1){
                fos.write(b);
            }
        }
    }
}
