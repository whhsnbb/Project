import java.io.IOException;

public class Demo_Synchronized {
    public static void main(String[] args) {
        Printer  p = new Printer();

        Thread t1 = new Thread(() -> {
            while(true){
                p.Print2();
            }
        });

        Thread t2 = new Thread(() -> {
            while(true){
                p.Print1();
            }
        });

        t1.start();
        t2.start();
    }
}

class Printer{
    final Demo d = new Demo();
    void Print1(){
        synchronized (d) {           //--锁对象可以是任意对象，但是不可以使用匿名对象，因为两个用的不是同一个对象
            System.out.print("黑");
            System.out.print("黑");
            System.out.print("黑");
            System.out.print("黑");
            System.out.print("黑");
            System.out.println();
        }
    }
    void Print2(){
        synchronized (d) {
            System.out.print("白");
            System.out.print("白");
            System.out.print("白");
            System.out.print("白");
            System.out.print("白");
            System.out.println();
        }
    }


    //同步非静态方法
    /*public synchronized void Print1(){
            System.out.print("黑");
            System.out.print("黑");
            System.out.print("黑");
            System.out.print("黑");
            System.out.print("黑");
            System.out.println();
    }
    public void Print2(){
        synchronized(this){
            System.out.print("白");
            System.out.print("白");
            System.out.print("白");
            System.out.print("白");
            System.out.print("白");
            System.out.println();
        }
    }*/


//同步静态方法
    /*public static synchronized void Print1(){
        System.out.print("黑");
        System.out.print("黑");
        System.out.print("黑");
        System.out.print("黑");
        System.out.print("黑");
        System.out.println();
    }
    public void Print2(){
        synchronized(Printer.class){
            System.out.print("白");
            System.out.print("白");
            System.out.print("白");
            System.out.print("白");
            System.out.print("白");
            System.out.println();
        }
    }*/
}

class Demo{

}