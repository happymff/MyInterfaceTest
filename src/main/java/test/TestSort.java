package test;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Arrays;

/**
 * Created by mff on 2017/10/27.
 */
public class TestSort {
    public static void main(String[] args) {
        File dir = new File("/Users/mff/Documents/books");
        File[] files = dir.listFiles();
        System.out.println("before sort: ");
        for (int i = 0; i < files.length; i++) {
            System.out.print(files[i] + " ");
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(files);
        System.out.println("sort by name: ");

        for (int i = 0; i < files.length; i++) {
            System.out.print(files[i] + " ");
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(files, new CompratorBySize());
        System.out.println("sort by size: ");
        for (int i = 0; i < files.length; i++) {
            System.out.print(files[i] + " ");
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(files, new CompratorByLastModified());
        System.out.println("sort by last modified: ");
        for (int i = 0; i < files.length; i++) {
            System.out.print(files[i] + " ");
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

}
