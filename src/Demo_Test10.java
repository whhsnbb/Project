import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//  JDK1.6版本之前的流的标准处理异常代码

public class Demo_Test10 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis =null;
        FileOutputStream fos =null;
        try {
            fis = new FileInputStream("bbb.txt");
            fos = new FileOutputStream("aaa.txt");
            int b ;
            while((b = fis.read()) != -1){
                fos.write(b);
            }
        }finally{
                try{
                    if(fis != null)
                        fis.close();
                }finally{
                    if(fos != null)
                        fos.close();
                }
        }
    }
}
