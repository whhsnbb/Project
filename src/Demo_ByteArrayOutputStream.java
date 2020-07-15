import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

//              内存输出流

public class Demo_ByteArrayOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        ByteArrayOutputStream baos =new ByteArrayOutputStream();

        int b ;
        while ((b = fis.read()) != -1){
            baos.write(b);
        }

        //byte[] arr = baos.toByteArray();
        //System.out.println(new String(arr));
        System.out.println(baos.toString());

        fis.close();
    }
}
