import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 用小数组来增快输入输出流遍历的代码！

public class Demo_Test8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("hh.mp3");
        FileOutputStream fos = new FileOutputStream("Copy.mp3");
        byte[] array = new byte[1024 * 8];
        int len;
        while((len = fis.read(array)) != -1){
            fos.write(array,0,len);
        }
        fis.close();
        fos.close();
    }
}
