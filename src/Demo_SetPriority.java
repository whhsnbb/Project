//--设置线程优先级

public class Demo_SetPriority {
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
                    System.out.println(getName() + "...aaaaaa");
                }
            }
        };
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
