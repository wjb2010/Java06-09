package Java07;

/**
 * Created by dllo on 16/9/28.
 */
public class Main {

    public static void main(String[] args) {

        //常用类Sring
        //一,创建
        String str = "啊啊啊";
        //创建String类型变量本来的方式
        String str1 = new String();
        //带参构造方法
        String str2 = new String("直接传参");
        System.out.println(str2);


        //2.常用操作方法
        //1.charAt(int index)
        //功能:获取某个位置的字符(从0开始)

        String str3 = "abc";
        char chr = str3.charAt(1);
        System.out.println(chr);

        //练习:将字符串"abcdefghijklmn"中的"defghi"打印输出

        //提示:用for循环

        String test = "abcdefghijklmn";

        for (int i = 0; i < test.length(); i++) {

            if (test.charAt(i) == 'd') {
                for (int j = i; j < test.length(); j++) {
                    System.out.print(test.charAt(i));
                }


            }

        }


        //2.concat(String str)
        //功能:拼接两个字符
        String str5 = "小A";
        String str6 = "小B";
        String str7 = str5.concat(str6);
        System.out.println(str7);

        //练习:拼接字符串"德鹏","Love","胡洋"
        //打印并输出
        String test2 = "德鹏";
        String test3 = "胡洋";
        String test4 = "Love";

        // String test5=test2.concat(test4).concat(test3);
        // System.out.println(test5);


        //更长用的拼接方式
        //与顺序有关
        String test5 = test2 + test4 + test3;
        System.out.println(test5);


        //3.boolean endsWith(String str)
        //判断是否以某个字符串作结尾
        String str8 = "abcd.gif";
        //判断个数可以任意指定
        boolean ret = str8.endsWith(".gif");
        System.out.println(ret);


        //↑练习:有一张图片,判断图片格式是否是gif


        //4,boolean startsWith(String str)
        //功能:判断是否以某字符串作开始
        String str9 = "abcdefg";
        boolean ret2 = str9.startsWith("abc");
        System.out.println(ret2);

        //5.itn length()
        //功能:返回字符串的长度
        String str10 = "aaaaaaa";
        int len = str10.length();
        System.out.println(len);


        //6,boolean isEmpty()
        //功能:判断字符串是否为空(是否有实际内容)
        //若没有内容,返回true
        //否则返回false
        String str11 = "";
        boolean ret6 = str11.isEmpty();
        System.out.println(ret6);

        //7.replace(char oldChar,char newChar)
        //功能:替换某个字符,将oldChar替换为newChar
        String str12 = "abcdefb";
        String ret7 = str12.replace('b', 'z');
        System.out.println(ret7);


        //8.substring(int start,int end)
        //功能:截取,从strat开始,截取到end
        //范围:左闭右开(包含左边不包含右边)
        String str14 = "abcdefg";
        String ret3 = str14.substring(3, 5);
        System.out.println(ret3);

        //练习:判断一个图片的格式
        //如果不是.jpg,将图片名截取
        //拼接为.jpg
        //适用于任意长度的图片名

        String page1 = "      sdfsdfsdfsdfs      fsdfsdfsdfsfs      dfsdfsdf我爱大不列颠及北爱尔兰联合王国sdfsd.jpg";
        //去掉首尾的空格
        String page = page1.trim();
        //判断个数可以任意指定
        if (page.endsWith(".gif")) {

            System.out.println("图片名是:" + page);
        } else {
            //int i=page.charAt('.');
            int i = page.indexOf('.');
            String a = page.substring(0, i);
            System.out.println(a + ".gif");


        }


        //可变字符串

        //StringBuilder-非线程安全 快
        //StringBuffer-线程安全 慢


        StringBuffer sb = new StringBuffer();

        //1.append-拼接
        //也可以拼接其他类型,如int

        sb.append("德");
        sb.append("鹏");
        sb.append("糖");
        //将int转为String拼接在一起
        sb.append(5);
        System.out.println(sb);


        //2.delete-删除
        //参数:开始位置,结束位置
        //范围:左闭右开
        sb.delete(0, 2);
        System.out.println(sb);

        //3.insert-插入
        //参数:插入的位置,插入的数据
        //在位置的左边插入
        sb.insert(1, "儿");
        System.out.println(sb);


        //4.截取
        //截取不可变字符串的方法
        //可变字符串可以用不可变字符串的方法
        //使用方式按照不可变字符串的操作方式
        String test1=sb.substring(0,1);
        System.out.println(test1);






    }

}
