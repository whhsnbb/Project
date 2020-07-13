import java.io.*;
import java.util.Scanner;

//  IO流  拷贝文件

public class Demo_Test12 {
    public  static void main(String[] args) throws IOException{
        File file =getFile();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }
        bis.close();
        bos.close();

    }
    public static File getFile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件的路径：");
        while(true){
            String line = sc.nextLine();
            File file = new File(line);
            if(!file.exists()){
             System.out.println("输入的文件路径不存在，请重新输入:");
            }else if(file.isDirectory()){
                System.out.println("输入的是文件夹路径，请重新输入:");
            }else{
                return file;
            }
        }
    }
}
