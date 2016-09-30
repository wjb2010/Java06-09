package Java07_homework;

/**
 * Created by dllo on 16/9/28.
 */
public class C1 extends B1{

    private  String c;

    public C1() {
    super();
    }

    public C1(String a, String b, String c) {
        super(a, b);
        System.out.println("我是C1的有参构造方法");
        this.c = c;
    }


    @Override
    public void info() {
        super.info();
        System.out.println(getC());
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
