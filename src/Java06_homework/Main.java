package Java06_homework;

/**
 * Created by dllo on 16/9/27.
 */
public class Main {


    public static void main(String[] args) {

        A1 a1 = new A1("a", "b", "c", "d");
        a1.info();

        B1 b1 = new B1("a", "b", "c", "d");
        b1.info();

        C1 c1 = new C1("a", "b", "c", "d");
        c1.info();

        D1 d1 = new D1("a", "b", "c", "d");
        d1.info();


        E1 e1 = new E1("a", "b", "c", "d");
        e1.info();




        boolean a=true;
        String c="bb";
        String d=c+a;
        boolean b=false;
        System.out.println(c+b);

    }
}
