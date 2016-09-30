package Java06;

/**
 * Created by dllo on 16/9/27.
 */
public class Main {

    public static void main(String[] args) {

        Student stu = new Student("测试1", "测试2", 999, 999);
//        stu.setScore(99);
//        stu.setName("张三");
//        stu.setSex("男");
//        stu.setAge(18);
        //stu.info();

        Pigeon pigeon = new Pigeon("测试1", "测试2", "测试3");
        System.out.println(pigeon.getName());
        System.out.println(pigeon.getShortName());
        System.out.println(pigeon.getSize());


        //使用final定义的变量是常量,不能改变
        //final修饰的类不能被继承
        //final修饰的方法不能被重写
        final String  a = "a";


    }
}
