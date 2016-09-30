package Java09;

/**
 * Created by dllo on 16/9/30.
 */
public class Main {

    public static void main(String[] args) {
        try {
            //将容易出现异常的代码写在try中
            //出现异常后会进入catch中执行
            int a = 0;
            a = a / 0;

            //当出现一处异常后
            //try后面的代码将不会执行
            Integer num = null;
            num += 5;

            //异常是一个类
            //Exception是所有异常的父类
            //常见的异常(子类);
            //算数异常,数组越界异常,类型转换错误异常;
            //初学时也可能遇到不合理异常

        } catch (ArithmeticException e) {
            //捕捉到异常,可以自己处理
            System.out.println("出现算数异常");
            //也可以交给系统默认处理
            //e.printStackTrace();

            //多个catch可以捕捉多种类型异常
        }catch (NullPointerException e){


            System.out.println("出现空指针异常");


        }catch (Exception e){

            //注意,捕捉多个异常,要按照继承关系
            //将父类放在下面,否则会被大的异常捕获
            System.out.println("未知");

        }finally {
            //无论是否出现异常,都会进入到finally执行
            //一般会在此处做一些善后处理
        }

        //即使try中出现异常,程序依然会继续向下执行;
        System.out.println("继续执行测试");


        Car a=new Car();
        //注意:一旦方法抛出异常
        //就需要去捕捉异常
        try {
            a.setWheelCont(5);
        } catch (Exception e) {
            //System.out.println("轮子数量异常");
            e.printStackTrace();

        }

    }


}
