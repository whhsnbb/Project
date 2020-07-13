import java.io.File;
import java.io.IOException;

public class Demo_Test7 {
    public static void main(String[] args) throws IOException {
        File file = new File("aaa.txt");
        File file1 = new File("E:\\project\\Project\\src");
        File[] arr = file1.listFiles();
        for (File string:arr
             ) {
            System.out.println(string.getName());
        }

        /*file.delete();
        System.out.println(file.isFile());
        File file1 = new File("bbb.txt");

        file1.delete();
        File file2 = new File("ccc");
        System.out.println(file2.mkdir());
        file2.delete();
        File file3 = new File ("ddd");
        file3.delete();*/
    }
}
