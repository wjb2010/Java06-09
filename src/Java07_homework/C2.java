package Java07_homework;

/**
 * Created by dllo on 16/9/28.
 */
public class C2 extends B2{

    private String c;

    public C2() {
    }

    public C2(String a, String b, String c) {
        super(a, b);
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
