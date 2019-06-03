/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import java.io.*;
/**
 *
 * @author Сергей
 */
public class Lab9 {
static String source = "E:\\folder\\test.txt";
static String des = "E:\\folder\\folder";

static void dr(File fl,boolean first) throws IOException
{
    if(fl.isDirectory())
    {
        createDir(fl.getPath(),first);
        File flist[]=fl.listFiles();
        for(int i=0;i<flist.length;i++)
        {

            if(flist[i].isDirectory())
            {
                dr(flist[i],false);
            }

            else
            {

                copyData(flist[i].getPath());
            }
        }
    }

    else
    {
        copyData(fl.getPath());
    }
}

private static void copyData(String name) throws IOException {

        int i;
        String str=des;
        for(i=source.length();i<name.length();i++)
        {
            str=str+name.charAt(i);
        }
        System.out.println(str);
        FileInputStream fis=new FileInputStream(name);
        FileOutputStream fos=new FileOutputStream(str);
        byte[] buffer = new byte[1024];
        int noOfBytes = 0;
         while ((noOfBytes = fis.read(buffer)) != -1) {
             fos.write(buffer, 0, noOfBytes);
         }


}

private static void createDir(String name, boolean first) {

    int i;

    if(first==true)
    {
        for(i=name.length()-1;i>0;i--)
        {
            if(name.charAt(i)==92)
            {
                break;
            }
        }

        for(;i<name.length();i++)
        {
            des=des+name.charAt(i);
        }
    }
    else
    {
        String str=des;
        for(i=source.length();i<name.length();i++)
        {
            str=str+name.charAt(i);
        }
        (new File(str)).mkdirs();
    }

}

public static void main(String args[]) throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    long startTime = System.currentTimeMillis();
    dr(new File(source),true);
}

}
