import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//字符流FileReader 和 FileWriter 的简单使用

public class Demo_Test14 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("bbb.txt");
        FileWriter fw = new FileWriter("ccc.txt");
        int b;
        while((b = fr.read()) != -1){
            fw.write((char) b);
        }
        fw.write("请大家多多关照！");
        fr.close();
        fw.close();
    }
}
