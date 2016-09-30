package Java08_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by dllo on 16/9/29.
 */
public class Main {
    public static void main(String[] args) {

        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
        ExtQ1();
        ExtQ2();

    }

    //1.随机产生20个10-100的随机整数放入数组,求最大值,最小值,平均值和元素之和
    public static void Q1() {
        int[] a1 = new int[20];
        Random random = new Random();


        for (int i = 0; i < 20; i++) {
            int a = random.nextInt(100 - 10 + 1) + 10;
            a1[i] = a;
            System.out.println(a1[i]);
        }
        for (int i = 0; i < a1.length - 1; i++) {

            for (int j = 0; j < a1.length - 1 - i; j++) {
                if (a1[i] < a1[j + 1]) {
                    a1[i] = a1[i] + a1[j + 1];
                    a1[j + 1] = a1[i] - a1[j + 1];
                    a1[i] = a1[i] - a1[j + 1];


                }
            }
        }

        System.out.println("最大值:" + a1[0]);
        System.out.println("最小值:" + a1[19]);

        int a = 0;
        for (int i = 0; i < a1.length; i++) {

            a += a1[i];


        }
        System.out.println("元素之和:" + a);
        double b = a / 20.0;

        System.out.println("平均值:" + b);


    }


    public static void Q2() {

        Random random = new Random();
        int[] a2 = new int[20];
        for (int i = 0; i < 20; i++) {

            int a = random.nextInt(50 - 10 + 1) + 10;
            if (a > 20 && a < 30) {
                a2[i] = a;
            }

        }

        for (int i = 0; i < a2.length; i++) {
            if (a2[i] != 0) {
                System.out.println(a2[i]);


            }

            if (a2[i] == 22) {
                System.out.println("数组包含22!");
            } else {

                System.out.println("数组不包含22!!");

            }
        }


    }


    public static void Q3() {

        int[] a3 = {3, 4, 5, 6, 7, 2, 3, 0, 10, 5};
        int[] temp = new int[10];
        for (int i = 0; i < a3.length; i++) {
            temp[9 - i] = a3[i];

        }
        System.out.println("数组是{3,4,5,6,7,2,3,0,10,5}");
        for (int i = 0; i < temp.length; i++) {
            a3[i] = temp[i];

        }
        System.out.print("新数组是:");
        for (int i = 0; i < a3.length; i++) {
            System.out.print(" " + a3[i]);

        }


    }

    public static void Q4() {
        System.out.println();
        ArrayList<String> a = new ArrayList<String>();
        a.add("丰田");
        a.add("奥迪");
        a.add("宝马");
        a.add("玛莎拉蒂");

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }


    }

    public static void Q5() {

        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("德玛西亚之力", "盖伦");
        hashMap.put("黑暗之女", "安妮");
        hashMap.put("德邦总管", "赵信");
        hashMap.put("诺克萨斯之手", "德莱厄斯");

        System.out.println(hashMap.get("德玛西亚之力"));


    }


    public static void ExtQ1() {

        int data = 20151231;
        int year = data / 10000;
        int month = data % 10000 / 100;
        int day = data % 100;
        System.out.println("输入的年份是:" + year);
        System.out.println("输入的月份是:" + month);
        System.out.println("输入的日是:" + day);


        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();


        hashMap.put(1, 31);
        hashMap.put(2, 28);
        hashMap.put(3, 31);
        hashMap.put(4, 30);
        hashMap.put(5, 31);
        hashMap.put(6, 30);
        hashMap.put(7, 31);
        hashMap.put(8, 31);
        hashMap.put(9, 30);
        hashMap.put(10, 31);
        hashMap.put(11, 30);
        hashMap.put(12, 31);
int a=0;

        for (int i = 1; i < month; i++) {
            a+=hashMap.get(i);

        }
        System.out.println("今年过了:"+(a+=day)+"天");

    }

    public static void ExtQ2(){
        ArrayList<Map> liaoNingList=new ArrayList<Map>();

        HashMap<String ,String> liaoNing=new HashMap<String,String>();

        liaoNing.put("辽宁省","大连市");
        liaoNing.put("沈阳市","沈阳市");
        liaoNing.put("丹东市","丹东市");

        liaoNingList.add(liaoNing);

        System.out.println(liaoNingList.get(0).get("大连市"));


    }

}





