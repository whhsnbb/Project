import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Demo_Properties {
        public static void main(String[] args) throws IOException {
            //Properties是HashTable的一个子类，可以当作集合使用
           /*
            Properties prop = new Properties();
            prop.put("abc", 123);
            System.out.println(prop);
            */

            //Properties的特殊功能    setProperty(String key,String value) getProperty(String key) prop.propertyNames()
            /*
            Properties prop = new Properties();
            /*
            prop.setProperty("abc", "123");
            prop.setProperty("def","456");
            System.out.println(prop.getProperty("abc"));
            Enumeration<String> en =(Enumeration<String>) prop.propertyNames();
            while(en.hasMoreElements()){
                String key = en.nextElement();           //获取properties的键集合
                String value = prop.getProperty(key);
                System.out.println(key + "=" + value);
            }
            */

            //Properties 的功能load(InputStream is)读取文档信息,store()将修改的集合的内容重新加载到文档
            Properties prop = new Properties();
            System.out.println("读取前 = " + prop);
            prop.load(new FileInputStream("prop.txt"));
            System.out.println("读取后 = " + prop);
            prop.setProperty("qq","2674108116");
            prop.storeToXML(new FileOutputStream("prop.txt"),"王航航的个人信息");
            System.out.println("修改后 = " + prop);
        }
}
