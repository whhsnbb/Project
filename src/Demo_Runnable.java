//�Զ��������˸���Ҳû�й�ϵ��Java����ʵ�ֶ���ӿ�
//�׶�:����ֱ��ʹ��thread�еķ����������Ȼ�ȡthread�Ķ������ʹ��thread�ķ��������븴��

public class Demo_Runnable {
    public static void main(String[] args){
        /*
        * Ҳ����ʹ�������ڲ�������߳�
        * new Thread(new Runnable(){
        *   public void run(){
        *       for(int i = 0 ; i < 1000 ; i ++){
        *       System.out.println("aaa");
        *           }
        *   }
        * }
        * ).start();
        * */



        MyRunnable mr = new MyRunnable();
        new Thread(mr).start();
        for( int i = 0 ; i < 10000 ; i ++){
            System.out.println("bb");
        }
    }
}

class MyRunnable implements Runnable{
    public void run(){
        for(int i = 0 ; i < 10000 ; i ++){
            System.out.println("aaaaaa");
        }
    }
}
