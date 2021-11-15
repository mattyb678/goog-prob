package com.github.mattyb678.goog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestListTest {

    @Test
    void testLessThanK() {
        var kthLargestList = new KthLargestList(new int[]{}, 4);
        assertEquals(kthLargestList.add(4), 4);
        assertEquals(kthLargestList.add(5), 4);
        assertEquals(kthLargestList.add(3), 3);
        assertEquals(kthLargestList.add(6), 3);
    }

    @Test
    void initialArray() {
        var kthLargestList = new KthLargestList(
                new int[]{4, 5, 3, 6},
                4
        );
        assertEquals(kthLargestList.add(1), 3);
        assertEquals(kthLargestList.add(7), 4);
    }

}