package com.codecool;

public class IntegerLinkedList {
    private int element;
    private IntegerLinkedList next;

    public IntegerLinkedList(int element) {
        this.element = element;
        this.next = null;
    }

    public void addElement(int element) {
        if (next == null) {
            this.next = new IntegerLinkedList(element);
        } else {
            next.addElement(element);
        }
    }

    @Override
    public String toString() {
        return "IntegerLinkedList{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
