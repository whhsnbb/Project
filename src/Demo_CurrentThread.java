//获取当前进行的线程

import com.sun.javafx.scene.layout.region.StrokeBorderPaintConverter;

import java.util.Scanner;

public class Demo_CurrentThread {
    public static void main(String[] args){

        new Thread(){
            public void run(){
                this.setName("鲁班大师");
                System.out.println(getName() + "......bbb");
            }
        }.start();

        new Thread(() -> System.out.println(Thread.currentThread().getName() + "......aaaaaa")).start();
        Thread.currentThread().setName("嘴强王者");
        System.out.println(Thread.currentThread().getName());

    }
}
