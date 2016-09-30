package Java06_homework;

/**
 * Created by dllo on 16/9/27.
 */
public class G1 extends G{
    private String d;


    public G1(String a, String b, String c, String d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(getD());
    }

    public G1() {
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}

