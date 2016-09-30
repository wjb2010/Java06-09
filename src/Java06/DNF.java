package Java06;

/**
 * Created by dllo on 16/9/27.
 */
public class DNF extends Game {

    private String type;


    public DNF(String charactor, String mount, String type) {
        //4.super调用父类带参的构造方法
        super(charactor, mount);
        this.type = type;
    }

    public DNF() {

        super();

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //1.覆写
    //方法的覆写
    //不能比父类中访问权限更严格
    //@Override关键字
    //作用1:告诉调用者这是一个覆写的方法
    //作用2:自动检测是否满足覆写的条件
    //可以不添加Override关键字

    @Override
    public void info(){

        //5.调用父类同名方法
        super.info();
        System.out.println(type);


    }
}
