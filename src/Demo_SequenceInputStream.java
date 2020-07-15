import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo_SequenceInputStream {

    public static void main(String[] args) throws IOException {

        //SequenceInputStream连接两个字节输入流

       /* FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2 = new FileInputStream("b.txt");
        SequenceInputStream sis =new SequenceInputStream(fis1 , fis2);
        FileOutputStream fos = new FileOutputStream("ccc.txt");

        int b;

        while((b = sis.read()) != -1){
            fos.write(b);
        }

        sis.close();
        fos.close();*/

        //SequenceInputStream连接多个字节输入流
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2 = new FileInputStream("b.txt");
        FileInputStream fis3 = new FileInputStream("c.txt");
        FileOutputStream fos = new FileOutputStream("d.txt");
        Vector<FileInputStream> v = new Vector<>();

        v.add(fis1);
        v.add(fis2);
        v.add(fis3);

        Enumeration<FileInputStream> e = v.elements();
        SequenceInputStream sis =new SequenceInputStream(e);

        int b;

        while((b = sis.read()) != -1){
            fos.write(b);
        }
        fos.close();
        sis.close();

    }
}
