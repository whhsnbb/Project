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
        synchronized (d) {           //--�����������������󣬵��ǲ�����ʹ������������Ϊ�����õĲ���ͬһ������
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.println();
        }
    }
    void Print2(){
        synchronized (d) {
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.println();
        }
    }


    //ͬ���Ǿ�̬����
    /*public synchronized void Print1(){
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.println();
    }
    public void Print2(){
        synchronized(this){
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.println();
        }
    }*/


//ͬ����̬����
    /*public static synchronized void Print1(){
        System.out.print("��");
        System.out.print("��");
        System.out.print("��");
        System.out.print("��");
        System.out.print("��");
        System.out.println();
    }
    public void Print2(){
        synchronized(Printer.class){
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.println();
        }
    }*/
}

class Demo{

}