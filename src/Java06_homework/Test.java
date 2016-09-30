package Java06_homework;

/**
 * Created by dllo on 16/9/28.
 */
public class Test {
    public static void main(String[] args)  {
        new Meal();

    }
}


class Meal {

    public Meal() {
        System.out.println("meal");
    }

    Bread bread = new Bread();
}

class Bread {

    public Bread() {
        System.out.println("bread");
    }
}
