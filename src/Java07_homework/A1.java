package Java07_homework;

/**
 * Created by dllo on 16/9/28.
 */

public class A1 {
    private String a;


    public A1() {
        super();
        System.out.println("我是A1的无参构造方法");
    }

    public A1(String a) {

        this.a = a;
        System.out.println("我是A1的有参构造方法");
    }


    public void info(){
        System.out.println(getA());

    }
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
