//自定义类有了父类也没有关系，Java可以实现多个接口
//弊端:不能直接使用thread中的方法，必须先获取thread的对象才能使用thread的方法，代码复杂

public class Demo_Runnable {
    public static void main(String[] args){
        /*
        * 也可以使用匿名内部类完成线程
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
