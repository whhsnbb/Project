//--守护线程

public class Demo_SetDaemon {
    public static void main(String[] args){

        Thread t1 = new Thread(() -> {
            try {
                for(int i = 1 ; i <= 2 ; i ++){
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "...bbb");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 1; i <= 50; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "...aaaaaaaaa");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t2.setDaemon(true);       //设置t2为守护线程，t1结束t2则结束（可能不会立即结束，中间有时间缓存）
        t1.start();
        t2.start();
    }
}
