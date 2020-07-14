import java.io.*;

// InputStreamReader     OutputStreamWriter的使用    将字节转换为字符

public class Demo_Test17 {
    public static void main(String[] args) throws IOException{
        BufferedReader br
                = new BufferedReader(new InputStreamReader(new FileInputStream("bbb.txt"),"gbk"));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("aaa.txt"),"gbk"));
        int b ;
        while ((b = br.read()) != -1){
            bw.write(b);
        }
        br.close();
        bw.close();
    }
}
