package Java09;

/**
 * Created by dllo on 16/9/30.
 */
public class Car {
    //车轮的数量
    private int wheelCont;


//throw-声明可能抛出的异常类型
    //参照方法的返回值类型 return来理解
    public int getWheelCont() {
        return wheelCont;
    }

    public void setWheelCont(int wheelCont) throws WheelException{

        //若车轮数大于4个,抛出异常
        if (wheelCont > 4) {
            //Exception exception=new Exception();

            //调用自己写的异常类
            WheelException we=new WheelException("错误,轮子数量:"+wheelCont);
            //throw-语句的功能是抛出一个异常
            //throw+异常对象
            //注意,throw通常与throws配合使用
            //要抛出一个异常,先要声明这个异常

            //匿名访问方式,不定义名字,只能一次性访问
            //优点:简洁
            throw new WheelException("错误,轮子数量:"+wheelCont);

        }
        this.wheelCont = wheelCont;
    }
}
