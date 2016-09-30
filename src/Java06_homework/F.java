package Java06_homework;

/**
 * Created by dllo on 16/9/27.
 */
public class F {
    private String a;
    private String b;
    private String c;


    public F(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public F() {
    }

    public void info(){
        System.out.println(getA());
        System.out.println(getB());
        System.out.println(getC());



    }


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
