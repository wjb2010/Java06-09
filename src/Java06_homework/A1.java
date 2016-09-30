package Java06_homework;

/**
 * Created by dllo on 16/9/27.
 */

//子类A1继承A
public class A1 extends A {

    private String d;

    //无参构造方法
    public A1() {
        super();

    }
//带参构造方法,
    public A1(String a, String b, String c, String d) {
        super(a, b, c);
        this.d = d;
   }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(getD());

    }
}
