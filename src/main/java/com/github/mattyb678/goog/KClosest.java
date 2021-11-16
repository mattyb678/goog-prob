package com.github.mattyb678.goog;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <b>Find ‘k’ closest numbers</b>
 *<p/>
 * Problem Statement: Given a sorted number array and two integers ‘K’ and ‘X’, find ‘K’ closest
 * numbers to ‘X’ in the array. Return the numbers in the sorted order. ‘X’ is not necessarily
 * present in the array.
 */
public class KClosest {

    public int[] kClosest(int[] arr, int k, int x) {
        if (arr == null || arr.length == 0) return new int[]{};

        int left = 0;
        int right = arr.length - 1;

        while (right - left >= k) {
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }
        }

        return Arrays.stream(arr, left, right + 1)
                .toArray();
    }

}
