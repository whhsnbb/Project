import java.io.*;
import java.util.ArrayList;

//BufferedWriter 和 BufferReader 的一些特殊方法
//利用BufferedWriter 和 BufferReader进行文本反转
//LineNumberReader可以读取行号！

public class Demo_Test15 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("aaa.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("bbb.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line = bf.readLine()) != null){
            /*bw.write(line);
            bw.newLine();*/
            list.add(line);
        }
        for(int i = list.size()-1 ; i>=0 ; i--){
            bw.write(list.get(i));
            bw.newLine();
        }
        bw.close();
        bf.close();
    }
}
