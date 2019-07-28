package com.cui.数据结构.查找算法;

/**
 * 二分查找（折半查找）
 * 前提条件：表数据有序
 *思路：目标值target与中间值比较，若相等则返回，不相等则再根据target与中间值的关系，确定下一步查找左子表还是右子表
 * 时间复杂度：O(log 2n)
 */
public class BinarySearch {
    /**
     * 迭代版
     * @param a
     * @param target
     * @return
     */
    public static int binarySearch(int[] a, int target) {
        int low=0;
        int high = a.length;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (target == a[mid]) {
                return mid;
            } else if (target < a[mid]) {
                high = mid - 1;
            } else {
                low = low + 1;
            }
        }
        return -1;

    }

    /**
     * 递归版
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearch2(int[] a, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (target == a[mid]) {
            return mid;
        } else if (target < a[mid]) {
            return binarySearch2(a, target, low, mid - 1);
        } else {
            return binarySearch2(a, target, mid + 1, high);
        }
    }

    }
