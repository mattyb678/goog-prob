package com.github.mattyb678.goog;

public class ListNode<T> {

    private ListNode<T> next;

    private final T key;

    public ListNode(T key) {
        this(key, null);
    }

    public ListNode(T key, ListNode<T> next) {
        this.next = next;
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

}
