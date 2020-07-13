import java.io.*;

//BufferedInputStream和BufferedOutputStream增强输入输出流的代码

public class Demo_Test9{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("hh.mp3");
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
