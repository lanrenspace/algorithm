package com.lanrenspace.leetcode;

/**
 * @Author lanrenspace@163.com
 * @Description: https://leetcode.cn/problems/guess-number-higher-or-lower/
 **/
public class Eg374 {

    public int guessNumber(int n) {
        int left = 1, right = n, mid, target;
        while (left <= right) {
            mid = ((right - left) >> 1) + left;
            target = guess(mid);
            if (target == 0) {
                return mid;
            } else if (target < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int guess(int m) {
        return -1;
    }
}
