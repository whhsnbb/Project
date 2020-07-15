import java.io.File;
import java.util.Scanner;

//获取文件夹大小

public class Test3_GetDirLength {
    public static void main(String[] args){
        File dir = getDir();
        long length1 = GetDirLength(dir);
        System.out.println(length1);
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

    public static long GetDirLength(File dir) {
        int len = 0;
            for (File subfile : dir.listFiles()
            ) {
                if (subfile.isFile()) {
                    len += subfile.length();
                } else {
                    len += GetDirLength(subfile);
                }

            }
            return len;
    }
}
