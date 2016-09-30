package Java06;

import com.sun.xml.internal.ws.server.ServerRtException;

/**
 * Created by dllo on 16/9/27.
 */
public class Game {

    private String charactor;
    private String mount;

    public Game(String charactor, String mount) {
        //1.带参的构造方法有super
        super();
        this.charactor = charactor;
        this.mount = mount;


    }

  private final String c=null;



    public Game() {
        //2.无参的构造方法也要有super
        super();
    }


    public String getCharactor() {
        return charactor;
    }

    public void setCharactor(String charactor) {
        this.charactor = charactor;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }


    public void info(){

        System.out.println(charactor);
        System.out.println(mount);


    }
}
