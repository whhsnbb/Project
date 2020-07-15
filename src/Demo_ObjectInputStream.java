import java.io.*;
import java.util.ArrayList;

public class Demo_ObjectInputStream {
    public static void main(String[] args) throws IOException , ClassNotFoundException {
        /*ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Person p1 = (Person)ois.readObject();
        Person p2 = (Person)ois.readObject();
        //Person p3 = (Person) ois.read();        超出对象个数出现EOFException;
        System.out.println(p1);
        System.out.println(p2);
        ois.close();*/

        //优化版如下:
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        ArrayList<Person> list =(ArrayList<Person>) ois.readObject();
        for (Person p : list
             ) {
            System.out.println(p);
        }
        ois.close();
    }
}

