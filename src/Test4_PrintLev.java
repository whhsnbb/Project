import java.io.File;
import java.util.Scanner;

//���㼶��ӡ�ļ���

public class Test4_PrintLev {
    public static void main(String[] args){
        File dir =getDir();
        PrintLev(dir,0);
    }

    public static File getDir(){
        Scanner sc =new Scanner(System.in);
        System.out.println("��������һ���ļ���·��:");
        while(true) {
            String line = sc.nextLine();
            File dir = new File(line);
            if (!dir.exists()){
                System.out.println("��������ļ���·�������ڣ�������������:");
            }else if(dir.isFile()){
                System.out.println("����������ļ�·����������������:");
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
