package Java06;

/**
 * Created by dllo on 16/9/27.
 */
public class Pigeon extends Bird{

    private String shortName;



    public Pigeon(String name, String size, String shortName) {
        super(name, size);
        this.shortName = shortName;
    }


    public Pigeon(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }













}
