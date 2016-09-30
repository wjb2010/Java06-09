package Java06;

/**
 * Created by dllo on 16/9/27.
 */
public class Person {

    private String name;
    private String sex;
    private int age;

    //    public String getName() {
//        return name;
//    }
    public void info() {

        System.out.println(name);
        System.out.println(sex);
        System.out.println(age);


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //添加默认超类方法
    public Person() {
        super();
    }

    public Person(String name, String sex, int age) {
        //添加默认超类方法
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


}
