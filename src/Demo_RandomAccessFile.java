import java.io.IOException;
import java.io.RandomAccessFile;

//           随机访问流和读写数据！

public class Demo_RandomAccessFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("a.txt","rw");
        raf.write(97);
        int x = raf.read();
        raf.seek(10);
        raf.write(98);
        System.out.println(x);
        raf.close();
    }
}
