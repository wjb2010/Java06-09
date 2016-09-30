package Java06;

/**
 * Created by dllo on 16/9/27.
 */
public class Student extends Person {

    private int score;


    public int getScore() {
        return score;
    }

    @Override
    public void info() {
        //this先调用自己的东西,若没有再调用继承而来的父类的资源
        //super直接调用继承而来的父类的资源
        super.info();
        System.out.println(this.getName());
        System.out.println(getAge());
        System.out.println(getScore());
        System.out.println(getSex());


    }



    public Student(int score) {
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public Student() {
super();

    }



    //构造方法中调用超类时,super语句放在句首


    public Student(String name, String sex, int age, int score) {
        super(name, sex, age);
        this.score = score;
    }



}
