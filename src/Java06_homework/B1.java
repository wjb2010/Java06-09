package Java06_homework;

/**
 * Created by dllo on 16/9/27.
 */
public class B1 extends B {


    private String d;

    public B1(String a, String b, String c, String d) {
        super(a, b, c);
        this.d = d;
    }

    public B1() {
        super();
    }


    @Override
    public void info() {
        super.info();
        System.out.println(getD());
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}
