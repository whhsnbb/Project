import java.io.File;
import java.util.Scanner;

//ɾ���ļ���

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
}
