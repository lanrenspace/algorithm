package com.lanrenspace.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lanrenspace@163.com
 * @Description: 问题：给定一个排序的整数数组 nums ，其中元素的范围在 闭区间 [lower, upper] 当中，返回不包含在数组中的缺失区间。
 * eg:
 * 输入: nums = [0, 1, 3, 50, 75], lower = 0 和 upper = 99,
 * 输出: ["2", "4->49", "51->74", "76->99"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/missing-ranges
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Eg163 {

    public static void main(String[] args) {
//        int[] nums = {0, 1, 3, 50, 75};
//        List<String> missingRanges = Eg163.findMissingRanges(nums, 0, 99);
//        System.out.println(missingRanges);
        System.out.println(9 ^ 1);
    }


    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        for (int num : nums) {
            if (num > lower) {
                result.add(appendStr(lower, Math.min(num - 1, upper)));
                lower = num + 1;
            } else if (num == lower) {
                lower++;
            }
            if (lower > upper) {
                break;
            }
        }
        if (lower <= upper) {
            result.add(appendStr(lower, upper));
        }
        return result;
    }

    public static String appendStr(int lower, int upper) {
        if (lower == upper) {
            return String.valueOf(lower);
        }
        return lower + "->" + upper;
    }
}
