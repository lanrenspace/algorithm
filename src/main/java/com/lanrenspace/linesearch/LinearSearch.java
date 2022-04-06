package com.lanrenspace.linesearch;

/**
 * @Author lanrenspace@163.com
 * @Description: 线性查找
 **/
public class LinearSearch {


    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {12, 123, 34, 56, 78, 96};
        int target = LinearSearch.search(data, 34);
        System.out.println(target);

    }
}
