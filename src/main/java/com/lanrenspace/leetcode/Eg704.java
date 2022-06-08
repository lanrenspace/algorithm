package com.lanrenspace.leetcode;

/**
 * @Author lanrenspace@163.com
 * @Description: https://leetcode.cn/problems/binary-search/
 **/
public class Eg704 {

    public static void main(String[] args) {
        Eg704 eg704 = new Eg704();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(eg704.search(nums, 5));
    }

    /**
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     * 解释: 9 出现在 nums 中并且下标为 4
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return -1;
        }
        // 如果 target 不在 nums 范围内
        if (nums[0] > target || nums[nums.length - 1] < target) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
