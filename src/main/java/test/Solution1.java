package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution1 {
    public static int heightChecker(int[] heights) {
        int count = 0;
        if (heights.length <= 1) {
            return count;
        }
        int temp[] = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(heights);

        for (int i = 0; i < heights.length; i++) {
            if (temp[i] != heights[i]) {
                count++;
            }
        }

        System.out.println(count);
        return count;
    }

    public static int heightChecker1(int[] heights) {
        int count = 0;
        String s1 = getString(heights);
        Arrays.sort(heights);
        String s2 = getString(heights);
        String[] chars1 = s1.split(",");
        String[] chars2 = s2.split(",");
        for (int i = 0; i < chars1.length; i++)
            if (!chars1[i].equals(chars2[i]))
                count++;
        return count;
    }

    public static String getString(int[] heights) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < heights.length; i++) {
            sb.append(heights[i]);
            sb.append(',');
        }
        return sb.toString();
    }

    public static int findMin(int[] nums) {

        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }

        return nums[0];
    }


    public static void main1(String[] args) {
        int[] a = {1, 1, 4, 2, 1, 3};
        int[] b = {1, 7, 5, 9, 3, 6, 10, 3, 7, 3, 8, 7, 2, 4, 10, 7, 7, 6, 6, 6, 1};
        int[] c = {4, 5, 6, 7, 0, 1, 2};
        String s = "123321abcdefghi";
        // heightChecker1(a);
        // heightChecker(b);
        //System.out.println(findMin(c));
        getStringCounts(s);
    }

    public static void main(String[] args) {
        String s = "123zyxa";
        //getStringCounts(s);
//        getnum(s);
        List list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(1);

        getListArray2(list);
    }

    public static List getListArray(List cc) {
        Collections.sort(cc);
        Collections.reverse(cc);
        System.out.println(cc);
        return cc;
    }

    public static List getListArray1(List cc) {

        // Integer[] ids_integer = integer_list.toArray(new Integer[integer_list.size()]);
        //System.out.println(Arrays.toString(ids_integer));

        Integer[] ints = new Integer[cc.size()];
        cc.toArray(ints);
        int temp = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }

        }
        System.out.println(Arrays.asList(ints));
        return Arrays.asList(ints);
    }


    public static List getListArray2(List cc) {

        // Integer[] ids_integer = integer_list.toArray(new Integer[integer_list.size()]);
        //System.out.println(Arrays.toString(ids_integer));

        Integer[] ints = new Integer[cc.size()];
        cc.toArray(ints);
        quickSort(ints,0,ints.length-1);
        System.out.println(Arrays.asList(ints));
        return Arrays.asList(ints);
    }

    public static void quickSort(Integer[] ints, int start, int end) {
        if (start < end) {
         int base= ints[start];
         int temp;
         int i =start, j =end;
         do {
             while (ints[i]<base&&i<end){
                 i++;
             }
             while (ints[j]>base&&j>start){
                 j--;
             }
             if (i<=j){
                 temp=ints[i];
                 ints[i]=ints[j];
                 ints[j]=temp;
                 i++;
                 j--;
             }
         }while (i<=j);
          if (start<j){
              quickSort(ints,start,j);
          }
          if (i>end){
              quickSort(ints,i,end);
          }
         }
    }

    public static int judgeCharacter(char cc) {

        if (cc >= '0' && cc <= '9') {
            return 1;
        } else if (cc >= 'A' && cc <= 'Z') {
            return 2;
        } else if (cc >= 'a' && cc <= 'z') {
            return 3;
        } else {
            return -1;
        }
    }

    public static String getnum(String str) {
        System.out.println(str);
        StringBuilder rightArr1 = new StringBuilder();
        StringBuilder numArr1 = new StringBuilder();
        int MaxLength = 0;
        int Length = 0;
        int OrderType = -1;  //-1 为前后没有任何顺序 1 为升序 2 为降序 0 为平序
        int index = 0;
        System.out.println("str的长度" + str.length());
        for (int i = 0; i < str.length() - 1; i++) {
            System.out.println("i=" + i);
            //判断是否从头开始计算, 并给升序降序或者平序做标记
            if (Length == 0 || OrderType == -1) {
                index = i;
                if (str.charAt(i) < str.charAt(i + 1) && (judgeCharacter(str.charAt(i)) == judgeCharacter(str.charAt(i + 1)))) {
                    OrderType = 1;
                } else if (str.charAt(i) > str.charAt(i + 1) && (judgeCharacter(str.charAt(i)) == judgeCharacter(str.charAt(i + 1)))) {
                    OrderType = 2;
                } else if (str.charAt(i) == str.charAt(i + 1)) {
                    OrderType = 0;
                }
                Length += 1;
            } else {
                if (OrderType == 1) {
                    if (str.charAt(i) > str.charAt(i + 1) || (judgeCharacter(str.charAt(i)) != judgeCharacter(str.charAt(i + 1))) || (i + 2 == str.length())) {
                        if (i - index + 1 > MaxLength) {
                            StringBuilder rightArr = new StringBuilder();
                            StringBuilder numArr = new StringBuilder();
                            MaxLength = i - index + 1;
                            if (i + 2 == str.length()) {
                                rightArr.append(str.substring(index, i + 2));
                            } else {
                                rightArr.append(str.substring(index, i + 1));
                            }
                            numArr.append(i - index + 1);
                            rightArr1 = rightArr;
                            numArr1 = numArr;
                        } else if (i - index + 1 < MaxLength) {
                            StringBuilder rightArr = new StringBuilder();
                            if (i + 2 == str.length()) {
                                rightArr.append(str.substring(index, i + 2));
                            } else {
                                rightArr.append(str.substring(index, i + 1));
                            }
                            rightArr1 = rightArr;
                            numArr1.append(i - index + 1);
                        }
                        Length = 1;
                        OrderType = -1;
                    } else {
                        Length += 1;
                    }
                    //处理降序序列
                } else if (OrderType == 2) {
                    if (str.charAt(i) < str.charAt(i + 1) || (judgeCharacter(str.charAt(i)) != judgeCharacter(str.charAt(i + 1))) || (i + 2 == str.length())) {
                        if (i - index + 1 > MaxLength) {
                            StringBuilder rightArr = new StringBuilder();
                            StringBuilder numArr = new StringBuilder();
                            MaxLength = i - index + 1;
                            if (i + 2 == str.length()) {
                                rightArr.append(str.substring(index, i + 2));
                            } else {
                                rightArr.append(str.substring(index, i + 1));
                            }
                            numArr.append(i - index + 1);
                            rightArr1 = rightArr;
                            numArr1 = numArr;
                        } else if (i - index + 1 == MaxLength) {
                            StringBuilder rightArr = new StringBuilder();
                            if (i + 2 == str.length()) {
                                rightArr.append(str.substring(index, i + 2));
                            } else {
                                rightArr.append(str.substring(index, i + 1));
                            }
                            rightArr1 = rightArr;
                            numArr1.append(i - index + 1);
                        }
                        Length = 1;
                        OrderType = -1;
                    } else {
                        Length += 1;
                    }
                    //处理平序序列
                } else if (OrderType == -1) {
                    Length = 1;

                } else {
                    Length += 1;
                }
            }
        }

        System.out.println("rightArr=" + rightArr1.toString());
        System.out.println("numArr=" + numArr1.toString());
        return rightArr1.toString();

    }

    public static int[] transToASCII(String s) {
        char[] chars = s.toCharArray();
        int[] charsint = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charsint[i] = chars[i];
        }
        return charsint;
    }

    public static int[] compare1(int[] ints) {

        int i = 0;
        int[] count = new int[ints.length - 1];
        int k = 0;
        int max = 0;
        int min = 0;
        while (i < ints.length - 1) {

            if (ints[i] <= ints[i + 1]) {
                max = min;
                for (int j = i; j < ints.length; j++) {
                    if (max <= ints[j]) {
                        count[k]++;
                    } else {
                        break;
                    }
                    max = ints[j];
                    i = j;
                }
            } else {
                min = max;
                for (int j = i; j < ints.length; j++) {
                    if (min >= ints[j]) {
                        count[k]++;
                    } else {
                        break;
                    }
                    min = ints[j];
                    i = j;
                }

            }
            k++;
        }
        return count;

    }

    public static void getStringCounts(String s) {
        int[] s1 = transToASCII(s);
        int[] s2 = compare1(s1);
        int max = getMax(s2);
        System.out.println(max);
        int countAll = 0;
        for (int i = 0; i < max; i++) {
            countAll = countAll + s2[i] - 1;
            System.out.println(s2[i]);
        }
        System.out.println(countAll);
        System.out.println("SSSSSS:" + s.substring(countAll, countAll + s2[max]));


    }

    public static int getMax(int[] s2) {
        int max = s2[0];
        int temp = 0;
        for (int i = 1; i < s2.length - 1; i++) {
            if (max <= s2[i]) {
                max = s2[i];
            } else {
                continue;
            }
            temp = i;
            System.out.println("temp:" + temp);
        }
        return temp;
    }
}