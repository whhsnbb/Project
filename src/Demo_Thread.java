//�ô�:����ֱ��ʹ��thread�еķ���,�����
//�׶�:�Ѿ����˸���Ͳ��������ַ�����Java���̳У�

public class Demo_Thread {
    public static void main(String[] args){
        /*
        * --Ҳ����ʹ�������ڲ�������߳�
        * new Thread(){
        * public void run(){
        *   for(int i = 0 ; i < 10000 ; i ++){
        *           System.out.println("aaa");
        *        }
        *   }
        * }.start();
        * */



        Mythread m = new Mythread();
        m.start();

        for( int i = 0 ; i < 100000 ; i ++){
            System.out.println("bb");
        }
    }


}

class Mythread extends Thread{
    public void run(){
        for(int i = 0 ; i < 100000 ; i ++){
            System.out.println("aaa");
        }
    }
        }