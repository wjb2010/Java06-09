package Java09;

import java.io.*;

/**
 * Created by dllo on 16/9/30.
 */
public class IOstream {


    public static void main(String[] args)  {

        //字符流
        //获取文件路径
        String filePath = "/Users/dllo/Downloads/test.txt";
        //获取文件对象
        File myFie = new File(filePath);

          try {

        //获取一个可读的文件字符流
        FileReader fr = new FileReader(myFie);
        //字符流的读取是按行进行
        //因此需要将输入流转换为可按行读的流
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        //读取每一行,将每行字符串存在line中
        //当读出的字符串不为空,代表还有内容可读
        //当无内容读时自动退出循环
        while ((line = br.readLine()) != null) {
            System.out.println(line);

             }
            //关闭流
            //顺序:先开后关
            br.close();
            fr.close();


             } catch (FileNotFoundException e) {
            //文件未找到异常
            e.printStackTrace();
             }catch (IOException e) {
            //IO流操作异常
            e.printStackTrace();
               }




    }
}
