package Java07_homework;

/**
 * Created by dllo on 16/9/28.
 */
public class B1 extends A1{

    private String b;

    public B1() {
        super();
    }

    public B1(String a, String b) {

        super(a);
        System.out.println("我是B1的有参构造方法");
        this.b = b;
    }


    @Override
    public void info() {
        super.info();
        System.out.println(getB());
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
