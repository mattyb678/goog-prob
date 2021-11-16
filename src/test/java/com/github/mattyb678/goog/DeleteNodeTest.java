package com.github.mattyb678.goog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeTest {

    Random random = new Random();

    @Test
    void test() {
        var size = 5;
        var vals = IntStream.range(0, size)
                .map(i -> random.nextInt(1000))
                .boxed()
                .collect(Collectors.toList());
        var head = new ListNode<>(vals.get(0));
        var cur = head;
        for (var i = 1; i < vals.size(); i++) {
            var newNode = new ListNode<>(vals.get(i));
            cur.setNext(newNode);
            cur = newNode;
        }
        print(head);
        var removed = DeleteNode.delete(head, vals.get(size / 2));
        print(removed);
        assertEquals(size - 1, count(removed));

    }

    private void print(ListNode<Integer> head) {
        var list = new ArrayList<>();
        var cur = head;
        while (cur != null) {
            list.add(cur.getKey());
            cur = cur.getNext();
        }
        System.out.println(list);
    }

    private int count(ListNode<Integer> head) {
        var count = 0;
        var cur = head;
        while (cur != null) {
            count++;
            cur = cur.getNext();
        }
        return count;
    }

}