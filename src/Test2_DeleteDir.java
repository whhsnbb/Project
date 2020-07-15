import java.io.File;
import java.util.Scanner;

//删除文件夹

public class Test2_DeleteDir {
    public static void main(String[] args){
        File dir =getDir();
        DeleteDir(dir);
    }

    public static void DeleteDir(File file){
        for (File subfile:file.listFiles()
             ) {
            if(subfile.isFile()){
                subfile.delete();
            }else{
                DeleteDir(subfile);
            }
        }
        file.delete();
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
