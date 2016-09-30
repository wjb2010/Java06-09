package Java09;

import java.io.File;

/**
 * Created by dllo on 16/9/30.
 */
public class FileRename {

    public static void main(String[] args) {

        File fl=new File("/Users/dllo/Downloads/////SSD");

        String[] files=fl.list();

        String filename="";
        File f=null;

        for (int i = 0; i < files.length; i++) {

            System.out.println(files[i]);
        }


        //System.out.println(fl.getAbsolutePath());
        int i=1;
        for (String file:files) {

            f=new File(fl,file);
            filename=f.getName();
            f.renameTo(     new File(
                    fl.getAbsolutePath()+"/"+
                            filename.replace(filename, i+++"")
                   // "888.txt"
                    //       /Users/dllo/Downloads/SSD/999
            )     );
        }




    }

}
