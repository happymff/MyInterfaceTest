package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

class Solution2 {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        char temp = ' ';
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(String.valueOf(s));
    }

    public static void getNums(String s) {
        char[] chars = s.toCharArray();
        int count = 1;
        int max = 0;
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                if (count >= max) {
                    max = count;
                }
                System.out.println(chars[i] + "=" + count);
                count = 1;
                continue;
            }
        }
        System.out.println(max);
    }

    public static void getNums1(String s) {
        //定义一个char类型数组，并把字符串导入这个数组
        char[] arr = s.toCharArray();
        //创建一个引用对象，HashMap集合
        HashMap<Character, Integer> hm = new HashMap<>();
        //使用增强for循环把数组内容添加到集合，
        for (char c : arr) {
            //再添加的时候，判断是否重复，并对出现次数进行统计
            hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);
        }
        System.out.println(hm);
    }

    public static void getNums2(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap();
        for (char a : chars) {
            hashMap.put(a, hashMap.containsKey(a) ? hashMap.get(a) + 1 : 1);
        }
        System.out.println(hashMap);
        Collection<Integer> collection = hashMap.values();
        Object[] object = collection.toArray();
        Arrays.sort(object);
        System.out.println(object[object.length - 1]);
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char s : S.toCharArray()) {
            for (char j : J.toCharArray()) {
                if (j == s) {
                    count++;
                }
                continue;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        String s1 = "abbceeeddsdee";
        //reverseString(s);
        // getNums2(s1);
        String J = "aA";
        String S = "bbbb";
        // System.out.println(numJewelsInStones(J,S));
        String initString = " we  a re happy ";
        String replaceString = "%20";
       // System.out.println(replaceString(initString, replaceString));
        int [] ints={5,1,3,3,5};
        //System.out.println(singleNumber(ints));
        int [] ints1={2,2,4,2};
        System.out.println(singleNumber(ints1));
    }

    //输入一个字符串，把其中的空格全部替换成%20，要求不能用replace这些现成的函数，且空间和时间复杂度尽量小
    public static String replaceString(String initString, String replaceString) {
        StringBuilder s1 = new StringBuilder();
        int beginIndex = 0;
        for (int i = 0; i < initString.length(); i++) {
            if (initString.charAt(i) == ' ') {
                s1.append(initString.substring(beginIndex, i));
                s1.append(replaceString);
                beginIndex = i + 1;
            }
        }
        s1.append(initString.substring(beginIndex,initString.length()));
        return s1.toString();
    }
    public static int singleNumber(int[] nums) {
        int singleNumber=0;
        boolean flag =false;
        for (int i =0; i <nums.length; i ++){
            for (int j =0;j <nums.length; j++){
                if (i==j){
                    continue;
                }
                if (nums[i]==nums[j]){
                    flag=true;
                    break;
                }else {
                    flag=false;
                }
            }
            if (flag){
                continue;
            }
            singleNumber=nums[i];
        }
        return singleNumber;
    }

    public static int singleNumberII(int[] nums) {
        int singleNumber=0;
        boolean flag =false;
        int count=1;
        for (int i =0; i <nums.length; i ++){
            for (int j =0;j <nums.length; j++){
                if (i==j){
                    continue;
                }
                if (nums[i]==nums[j]){
                    count++;
                }
                if (count==3){
                    flag=true;
                    break;
                }else {
                    flag=false;
                }
            }
            if (flag){
                continue;
            }
            singleNumber=nums[i];
        }
        return singleNumber;
    }
}
