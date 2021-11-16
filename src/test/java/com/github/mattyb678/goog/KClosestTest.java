package com.github.mattyb678.goog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestTest {

    @Test
    void testSingle() {
        var input = new int[]{3};
        var kClosest = new KClosest();
        assertArrayEquals(new int[]{3}, kClosest.kClosest(input, 1, 5));
    }

    @Test
    void testLessThanK() {
        var input = new int[]{3, 5, 10};
        var kClosest = new KClosest();
        assertArrayEquals(new int[]{3, 5, 10}, kClosest.kClosest(input, 5, 5));
    }

    @Test
    void test() {
        var input = new int[]{1, 2, 3, 5, 9, 10, 11};
        var kClosest = new KClosest();
        assertArrayEquals(new int[]{5, 9, 10}, kClosest.kClosest(input, 3, 7));

        input = new int[]{1,2,3,4,5};
        assertArrayEquals(new int[]{1, 2, 3, 4}, kClosest.kClosest(input, 4, 3));

        input = new int[]{1,2,3,4,5};
        assertArrayEquals(new int[]{1, 2, 3, 4}, kClosest.kClosest(input, 4, -1));

        input = new int[]{1,2,3,4,5};
        assertArrayEquals(new int[]{2, 3, 4, 5}, kClosest.kClosest(input, 4, 10));
    }

}