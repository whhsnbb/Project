//--�ػ��߳�

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
        t2.setDaemon(true);       //����t2Ϊ�ػ��̣߳�t1����t2����������ܲ��������������м���ʱ�仺�棩
        t1.start();
        t2.start();
    }
}
