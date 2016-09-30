package Java09;

import Java06_homework.F;

import java.io.*;

/**
 * Created by dllo on 16/9/30.
 */
public class IOstream2 {

    public static void main(String[] args) {

        //字节流
        String filePath="/Users/dllo/Downloads/test.txt";
        //供读取的文件
        File inFile=new File(filePath);
        //供写入的文件
        String filePathOut="/Users/dllo/Downloads/test2.txt";
        File outFile=new File(filePathOut);

        try {

            //输入流
            FileInputStream fis=new FileInputStream(inFile);


            //输出流
            FileOutputStream fos=new FileOutputStream(outFile);

            //读出的数据需要一个暂存的位置

            //获取文件内容长度
            int len=(int)inFile.length();
           byte[] buffer=new byte[len];

            //读取数据到buffer中
            fis.read(buffer);


            //从buffer中将数据写到另一个文件中
            fos.write(buffer);

            fis.close();
            fos.close();








        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
