package Java07_homework;

/**
 * Created by dllo on 16/9/28.
 */
public class Animal {


    public void move(){
        System.out.println("动物会走");

    }
}


class Cat extends Animal{
    public void move(){
        System.out.println("猫会走");

    }





}


class bosiCat extends Cat{

    public void sleep(){
        System.out.println("波斯猫睡觉");

    }


}


class Main2{
    public static void main(String[] args) {


        Animal animal=new Cat();

        animal.move();
    }

}
