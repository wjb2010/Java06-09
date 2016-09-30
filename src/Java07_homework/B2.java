package Java07_homework;

/**
 * Created by dllo on 16/9/28.
 */
public class B2 extends A2{
    private String b;


    public B2() {
    }

    public B2(String a, String b) {
        super(a);
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
