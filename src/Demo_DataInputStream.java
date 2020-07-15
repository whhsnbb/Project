import java.io.*;

public class Demo_DataInputStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("xxx.txt"));
        dos.writeInt(997);
        dos.writeInt(998);
        dos.writeInt(999);
        dos.close();
        DataInputStream dis = new DataInputStream(new FileInputStream("xxx.txt"));
        int x = dis.readInt();
        int y = dis.readInt();
        int z = dis.readInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        dis.close();
    }
}
