public class Demo_Test16 {
    public static void main(String[] args){
        DaLao dalao = new DaLao(new Student());
        dalao.code();
    }
}

interface Coder{
     void code();
}

class Student implements Coder{
    public void code(){
        System.out.println("我会C语言！");
        System.out.println("我会Java!");
    }
}

class DaLao implements Coder{
    //获取被装饰类的引用

    private Student s;

    //构造方法中传入被装饰类的对象

    public DaLao(Student s){
        this.s = s;
    }

    //对原有功能进行升级

    public void code(){
        s.code();
        System.out.println("我还会Javaee");
        System.out.println("我还会Android");
        System.out.println("我还会PHP");
    }
}