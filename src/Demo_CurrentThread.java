//获取当前进行的线程

public class Demo_CurrentThread {
    public static void main(String[] args){

        new Thread(){
            public void run(){
                this.setName("鲁班大师");
                System.out.println(getName() + "......bbb");
            }
        }.start();

        new Thread(new Runnable(){
            public void run(){
                System.out.println(Thread.currentThread().getName() + "......aaaaaa");
            }
        }).start();
        Thread.currentThread().setName("嘴强王者");
        System.out.println(Thread.currentThread().getName());
    }
}
