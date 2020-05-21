package com;

public class PrintElementsOfLinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }

        static class SinglyLinkedList {
            public SinglyLinkedListNode head;
            public SinglyLinkedListNode tail;

            public SinglyLinkedList() {
                this.head = null;
                this.tail = null;
            }

            public void insertNode(int nodeData) {
                SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

                if (this.head == null) {
                    this.head = node;
                } else {
                    this.tail.next = node;
                }

                this.tail = node;
            }
        }

        public static void printLinkedList(SinglyLinkedListNode head) {
            SinglyLinkedListNode temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
