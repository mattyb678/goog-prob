package com.github.mattyb678.goog;

import java.util.PriorityQueue;

/**
 * <b>Find the kth largest element in a number stream</b>
 * <p/>
 * Problem Statement: Design a class to efficiently find the Kth largest element in a stream of
 * numbers. The class should have the following two things:
 * <ul>
 *     <li>
 *         The constructor of the class should accept an integer array containing initial numbers
 *         from the stream and an integer ‘K’.
 *     </li>
 *     <li>
 *         The class should expose a function add(int num) which will store the given number and
 *         return the Kth largest number.
 *     </li>
 * </ul>
 */
public class KthLargestList {

    private final PriorityQueue<Integer> min;

    private final int k;

    public KthLargestList(int[] init, int k) {
        this.k = k;
        this.min = new PriorityQueue<>(this.k);

        for (var i : init) {
            add(i);
        }
    }

    public Integer add(int toAdd) {
        if (min.size() < k) {
            min.add(toAdd);
        } else {
            var peeked = min.peek();
            if (peeked != null && toAdd > peeked) {
                min.poll();
                min.add(toAdd);
            }
        }
        return min.peek();
    }

}

/*
k = 2
[1, 4, 3]
 */