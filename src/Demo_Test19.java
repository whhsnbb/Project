import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//获取输入文件夹路径下的所有java文件！

public class Demo_Test19 {
    public static void main(String[] args){
        File file = getDir();
        getJavaFile(file);
    }

    public static File getDir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径：");
        while(true){
            String line = sc.nextLine();
            File dir = new File(line);
            if(!dir.exists()){
             System.out.println("输入的文件夹路径不存在，请重新输入：");
            }else if(dir.isFile()){
                System.out.println("输入的是文件路径，请重新输入：");
            }else{
                return dir;
            }
        }
    }

    public static void getJavaFile(File dir) {
        File[] dirs = dir.listFiles();
        for (File flag : dirs
             ) {
            if(flag.isFile() && flag.getName().endsWith(".java")){
                System.out.println(flag);
            }else if(flag.isDirectory()){
                getJavaFile(flag);
            }
        }
    }
}
