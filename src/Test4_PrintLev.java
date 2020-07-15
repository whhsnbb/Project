import java.io.File;
import java.util.Scanner;

//按层级打印文件夹

public class Test4_PrintLev {
    public static void main(String[] args){
        File dir =getDir();
        PrintLev(dir,0);
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

    public static void PrintLev(File dir,int len){

        for (File subfile:dir.listFiles()
             ) {
            for(int i = 0 ; i <= len ; i ++)
                System.out.print("\t");
            System.out.println(subfile);
            if(subfile.isDirectory()){
                PrintLev(subfile,len+1);
            }
        }
    }
}
