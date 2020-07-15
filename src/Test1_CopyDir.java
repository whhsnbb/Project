import java.io.*;
import java.util.Scanner;

public class Test1_CopyDir {
        public static void main(String[] args) throws IOException {
                File father = getDir();
                File son = getDir();
                if(father.equals(son)){
                        System.out.println("目标文件夹是源文件的子文件夹");
                }else {
                        copy(father, son);
                }
}

        private static void copy(File father, File son) throws IOException {
                File neile1 = new File(father , son.getName());
                neile1.mkdir();
                for (File file: son.listFiles()
                     ) {
                        if(file.isFile()){
                        BufferedInputStream bis =
                                new BufferedInputStream(new FileInputStream(file));
                        BufferedOutputStream bos =
                                new BufferedOutputStream(new FileOutputStream(new File(neile1,file.getName())));
                                int b;
                                while((b = bis.read()) != -1){
                                        bos.write(b);
                                }
                                bis.close();
                                bos.close();
                        }else{
                                copy(neile1,file);
                        }
                }
        }

        public static File getDir(){
                Scanner sc =new Scanner(System.in);
                System.out.println("请您输入一个文件夹路径:");
                while(true) {
                        String line = sc.nextLine();
                        File dir = new File(line);
                        if (!dir.exists()){
                                System.out.println("您输入的文件夹路径不存在，请您重新输入:");
                        }else if(dir.isFile()){
                                System.out.println("您输入的是文件路径，请您重新输入:");
                        }else{
                                return dir;
                        }
                }
        }

}
