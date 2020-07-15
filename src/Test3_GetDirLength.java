import java.io.File;
import java.util.Scanner;

//��ȡ�ļ��д�С

public class Test3_GetDirLength {
    public static void main(String[] args){
        File dir = getDir();
        long length1 = GetDirLength(dir);
        System.out.println(length1);
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
