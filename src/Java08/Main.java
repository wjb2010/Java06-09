package Java08;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by dllo on 16/9/29.
 */
public class Main {

    // String a="d";
    public static void main(String[] args) {
      //  List list = new ArrayList();


        //数组
        //将一组变量放在一起
        //方便定义及使用多个变量
        //数组中的每个变量(成员/元素)类型要一样


        //第一种数组定义形式
        //数组类型[] 数组名={初值1,初值2,初值3.....}
        //数组名的命名规则和变量一样

        String[] strArr = {"初值1", "初值2", "初值3"};

        //访问数组中的元素
        //数组名[下标(偏移/位置)]
        //将数组中的第二个元素打印输出
        //注意数组的下标从0开始
        System.out.println(strArr[1]);

        //方括号也可以加在变量名后
        int a[] = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 0};


        //练习:定义一个数组,用for循环打印所有元素

        int[] b = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 0};

        //更兼容的写法
        //数组名.length:获取数组中元素的个数

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        //第二种数组的定义形式

        int[] arr = new int[10];
        int arr2[] = new int[100];
        //注意数组不要越界
        //arr2[99]=4;

        System.out.println("***************************");

        //练习:定义第二种形式的数组(10个元素)
        //1.用for循环存储10个100以内的随机数
        //2.打印数组的每个元素
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int c = random.nextInt(100 - 1 + 1) + 1;
            arr[i] = c;

        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }


        //集合
        //类似对数组的扩展
        //同样可以存储大量数据
        //优点是:可以随意  添加/删除元素

        //所有集合的父类是Collection
        //但一般不直接使用其创建对象
        //而是使用其子类完成

        //Lis是常用的一种集合类型
        //通常使用ArrayList来作为List的实例
        //集合中的元素类型需要相同
        //ArrayList<元素类型> 集合名
        ArrayList<String> arrL = new ArrayList<String>();


        //常用操作方法
        //1.添加
        arrL.add("西游记");
        arrL.add("封神榜");
        arrL.add("三国");
        arrL.add("水浒传");
        System.out.println(arrL);

        //2.插入
        //参数1:插入位置
        //参数2:插入内容
        arrL.add(1, "仙剑奇侠传");
        arrL.add(1, "软星");
        arrL.add(1, "英雄联盟");
        System.out.println(arrL);

        //3.添加所有
        //将一个集合整体添加到另一个集合中
        //第一另一个集合

        ArrayList<String> othL = new ArrayList<String>();
        othL.add("哈利波特");
        othL.add("13323");
        //将othL集合内容整体添加到arrL结合中
        arrL.addAll(othL);

        System.out.println(arrL);

        //4.移除
        //按内容移除
        arrL.remove("英雄联盟");
        System.out.println(arrL);

        //按位置移除
        arrL.remove(0);
        System.out.println(arrL);


        //5.集合中的元素个数
        int count = arrL.size();
        System.out.println(count);

        //6.获取某一位置的元素
        String str = arrL.get(1);
        System.out.println(str);

        //7.获取某一元素的位置
        int index = arrL.indexOf("水浒传");
        System.out.println(index);

        //8.判断集合中是否存在某个元素
        boolean ret = arrL.contains("封神榜");
        System.out.println(ret);

        //使用频率较高的3个方法
        //add()  size()   get()


        //练习:用for循环打印arrL中的所有元素
        for (int i = 0; i < arrL.size(); i++) {
            System.out.println(arrL.get(i));
        }



        //集合中的元素类型只可以是"类"类型
        //要存储基本数据类型时,需要使用包装类
        //int -Integer
        ArrayList<Integer> arrL2=new ArrayList<Integer>();
        ArrayList<Long> arrL3=new ArrayList<Long>();
        ArrayList<Boolean> arrL4=new ArrayList<Boolean>();
        ArrayList<Float> arrL5=new ArrayList<Float>();
        ArrayList<Double> arrL6=new ArrayList<Double>();
        ArrayList<Short> arrL7=new ArrayList<Short>();
        ArrayList<Character> arrL8=new ArrayList<Character>();



        //Map也是一种集合
        //List下标为数字,"有序"
        //Map下标为对象,常用String "无序"
        //Map通常使用HashMap创建实例

        //HashMap<下标类型,值类型> 变量名
        //下标 -key 值-value
        HashMap<String,String> maps=new HashMap<String,String>();

        //1.添加数据
        maps.put("name","德鹏");
        maps.put("name","德鹏2");
        maps.put("sex","男");
        maps.put("age","18");
        System.out.println(maps);

        //2.访问元素
        String name=maps.get("name");
        System.out.println(name);

        //3.删除
        maps.remove("sex");
        System.out.println(maps);

        //4.元素个数
        int cont=maps.size();
        System.out.println(cont);

        //5.所有val(值)
        System.out.println(maps.values());

        //6.所有key(下标)
        System.out.println(maps.keySet());



    }

}
