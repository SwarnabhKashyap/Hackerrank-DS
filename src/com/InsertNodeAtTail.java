package com;
import java.io.*;
public class InsertNodeAtTail {

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }

    }
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    //method for inserting the node at the tail of the list
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        SinglyLinkedListNode pointer = head;
        if(head==null)
        {
            temp.next=null;
            head = temp;
        }
        else{
            while(pointer.next!=null)
                pointer = pointer.next;
            temp.next = null;
            pointer.next = temp;
        }
        return head;


    }
    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }

    }
}
