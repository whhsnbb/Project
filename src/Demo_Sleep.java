//--�����߳�

public class Demo_Sleep {
    public static void main(String[] args){

        new Thread(() -> {
            try {
                for(int i = 1 ; i <= 10 ; i ++){
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "...bbb");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "...aaaaaaaaa");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


    }
}
