package test;

/**
 * Created by mff on 2017/10/26.
 */

import java.io.File;
import java.util.ArrayList;


public class ListAllFile {
    //用于判断目录或文件所在的层次
    public static int time;

    //递归方法
    public static void deepList(File file) {
        if (file.isFile() || (0 == file.list().length)) {
            return;
        } else {
            File[] files = file.listFiles();

            files = sort(files);

            for (File f : files) {
                StringBuffer buff = new StringBuffer();
                if (f.isFile()) {
                    buff.append(getTab(time));
                    buff.append(f.getName());
                } else {
                    buff.append(getTab(time));
                    buff.append(f.getName());
                    buff.append("】");
                }
                System.out.println(buff.toString());

                if (f.isDirectory()) {
                    time++;
                    deepList(f);
                    time--;
                }
            }
        }
    }

    /**
     * 将文件数组排序，目录放在上面，文件在下面
     *
     * @param file
     * @return
     */
    private static File[] sort(File[] file) {
        ArrayList<File> list = new ArrayList<File>();
        //放入所有目录
        for (File f : file) {
            if (f.isDirectory()) {
                list.add(f);
            }
        }
        //放入所有文件
        for (File f : file) {
            if (f.isFile()) {
                list.add(f);
            }
        }

        return list.toArray(new File[file.length]);
    }

    /**
     * 根据文件夹层数添加tab符号
     *
     * @param time 文件夹层数
     * @return
     */
    private static String getTab(int time) {
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < time; i++) {
            buff.append("\t");
        }
        return buff.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f = new File("/Users/mff/Documents/books/");
        deepList(f);
    }
}
