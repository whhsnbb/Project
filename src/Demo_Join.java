//-加入线程

public class Demo_Join {
    public static void main(String[] args){

        Thread t1 = new Thread(){
            public void run(){
                for(int i = 1 ; i < 50 ; i ++) {
                    System.out.println(getName() + "...bbb");
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for(int i = 1 ; i < 10 ; i ++){
                    try {
                        if(i == 2)
                        t1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "...aaaaaa");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
