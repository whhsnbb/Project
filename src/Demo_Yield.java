//--�����̣߳�Ч�������ԣ������˽�

public class Demo_Yield {
    public static  void main(String[] args){
        new Mythread1().start();
        new Mythread1().start();
    }
}
class Mythread1 extends Thread{
    public void run(){
        for( int i = 0 ; i < 100 ; i ++){
            if(i % 10 == 0)
                Thread.yield();
            System.out.println(getName() + "..." + i);
        }
    }
}
