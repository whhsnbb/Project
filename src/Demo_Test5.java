public class Demo_Test5 {
    public static void main(String[] args){
        try{
            System.out.println(1/0);
        }catch(Exception e) {
            //System.out.println(e.getMessage());
            //System.out.println(e.toString() );
            e.printStackTrace();
        }finally{
            System.out.println("遗愿完成，舒服了！");
        }
        /*Person p = new Person();
        p.setAge(-17);
        System.out.println(p.getAge());*/

    }
}
/*class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        if(age > 0 && age <200)
            this.age = age;
        else
           throw new RuntimeException("年龄非法!");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}*/
