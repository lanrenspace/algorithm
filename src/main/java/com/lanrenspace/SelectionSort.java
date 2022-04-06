package com.lanrenspace;

/**
 * @Author lanrenspace@163.com
 * @Description: 选择排序
 **/
public class SelectionSort {

    private SelectionSort() {

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // 定义最小元素下标
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    break;
                }
            }
            int t = array[i];
            array[i] = array[minIndex];
            array[minIndex] = t;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 5, 8, 12};
        SelectionSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
