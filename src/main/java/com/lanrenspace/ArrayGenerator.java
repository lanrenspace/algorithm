package com.lanrenspace;

/**
 * @Author lanrenspace@163.com
 * @Description:
 **/
public class ArrayGenerator {

    private ArrayGenerator() {

    }

    public static Integer[] generatorOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
