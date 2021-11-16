package com.github.mattyb678.goog;

import java.util.Objects;

/**
 * <b>Delete node with given key</b>
 *<p/>
 * Problem statement: You are given the head of a linked list and a key. You have to delete the
 * node that contains this given key.
 */
public class DeleteNode {

    public static <T> ListNode<T> delete(ListNode<T> head, T key) {
        if (head == null) return null;

        var foundKey = false;
        ListNode<T> prev = null;
        var cur = head;
        while (cur.getNext() != null) {
            if (Objects.equals(cur.getKey(), key)) {
                foundKey = true;
                break;
            }
            prev = cur;
            cur = cur.getNext();
        }
        if (foundKey) {
            if (prev == null) {
                return cur;
            } else {
                cur.setNext(cur.getNext().getNext());
            }
        }
        return head;
    }

}
