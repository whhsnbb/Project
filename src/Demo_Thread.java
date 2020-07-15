//好处:可以直接使用thread中的方法,代码简单
//弊端:已经有了父类就不能用这种方法（Java单继承）

public class Demo_Thread {
    public static void main(String[] args){
        /*
        * --也可以使用匿名内部类完成线程
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