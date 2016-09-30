package Java06;

/**
 * Created by dllo on 16/9/27.
 */
public class Bird {

    private String name;
    private String size;

    public Bird(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Bird() {

    }

    public void info() {
        System.out.println();
        System.out.println();
        System.out.println();

    }


}
