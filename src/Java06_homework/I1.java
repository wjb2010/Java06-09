package Java06_homework;

/**
 * Created by dllo on 16/9/27.
 */
public class I1 extends I{
    private String d;
private boolean g;



    private I i;
    public  I1() {
        super();
        
    }


    public I1(String a, String b, String c, String d) {
        super(a, b, c);
        this.d = d;
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
