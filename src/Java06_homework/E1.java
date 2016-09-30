package Java06_homework;

/**
 * Created by dllo on 16/9/27.
 */
public class E1 extends E{
    private String d;


    public E1(String a, String b, String c, String d) {
        super(a, b, c);
        this.d = d;
    }

    public E1() {
        super();
    }


    @Override
    public void info() {
        super.info();
        infoPlus();
    }

    public void infoPlus() {

        System.out.println(getD());
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}
