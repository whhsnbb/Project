//��ȡ��ǰ���е��߳�

public class Demo_CurrentThread {
    public static void main(String[] args){

        new Thread(){
            public void run(){
                this.setName("³���ʦ");
                System.out.println(getName() + "......bbb");
            }
        }.start();

        new Thread(new Runnable(){
            public void run(){
                System.out.println(Thread.currentThread().getName() + "......aaaaaa");
            }
        }).start();
        Thread.currentThread().setName("��ǿ����");
        System.out.println(Thread.currentThread().getName());
    }
}
