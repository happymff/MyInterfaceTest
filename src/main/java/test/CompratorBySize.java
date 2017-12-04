package test;

import java.io.File;
import java.util.Comparator;

/**
 * Created by mff on 2017/10/27.
 */


public class CompratorBySize implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        File file1 = (File)o1;
        File file2 = (File)o2;
        long diff = file1.length() - file2.length();
        if (diff > 0) {
            return 1;
        } else if (diff == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj){
        return true; //简单做法
    }
}