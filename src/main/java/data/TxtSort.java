package data;

/**
 * Created by mff on 2017/10/26.
 */

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


/*
 * 已知a.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
  请编写程序读取数据内容，把数据排序后写入b.txt中。

         分析：
         A：把s.txt这个文件给做出来
         B：读取该文件的内容，存储到一个字符串中
         c:把字符串转换成字符数组
         D:对字符进行排序
         E:把排序后的字符数组转换为字符串
         F:把字符串再次写入s.txt中
 */
public class TxtSort {


    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub


//读取该文件的内容，存储到一个字符串中
        BufferedReader br = new BufferedReader(new FileReader("/Users/mff/Desktop/test.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();

//把字符串转换为字符数组
        char[] chs = line.toCharArray();

//对字符数组进行排序
        Arrays.sort(chs);

//把排序后的字符数组转换为字符串
        String s = new String(chs);
        System.out.println(s);
//把字符串再次写入a.txt
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/mff/Desktop/test1.txt"));
        bw.write(s);
        bw.newLine();
        bw.flush();

        bw.close();
    }

}