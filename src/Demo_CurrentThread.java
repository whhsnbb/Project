//��ȡ��ǰ���е��߳�

import com.sun.javafx.scene.layout.region.StrokeBorderPaintConverter;

import java.util.Scanner;

public class Demo_CurrentThread {
    public static void main(String[] args){

        new Thread(){
            public void run(){
                this.setName("³���ʦ");
                System.out.println(getName() + "......bbb");
            }
        }.start();

        new Thread(() -> System.out.println(Thread.currentThread().getName() + "......aaaaaa")).start();
        Thread.currentThread().setName("��ǿ����");
        System.out.println(Thread.currentThread().getName());

    }
}
