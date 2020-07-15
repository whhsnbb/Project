import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

// 对象操作流

public class Demo_ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        Person p1 = new Person("张三", 23);
        Person p2 = new Person("李四", 24);
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.close();*/

        //优化版如下:

        Person p1 = new Person("张三", 23);
        Person p2 = new Person("李四", 24);
        Person p3 = new Person("王五", 25);
        Person p4 = new Person("赵六", 26);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(list);
        oos.close();

    }
}
    class Person implements Serializable{
        private int age;
        private String name;

        public Person(String name, int age) {
            this.name = name ;
            this .age = age ;
        }

        public Person(){

        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
