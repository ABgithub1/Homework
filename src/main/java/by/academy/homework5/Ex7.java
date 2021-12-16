package by.academy.homework5;

import java.io.IOException;
import java.util.Scanner;

public class Ex7 {
    private static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    private static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.print(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    //////////////////

    public static DoublyLinkedListNode reverse(DoublyLinkedList list) {
        while (list.head != null) {
            DoublyLinkedListNode now = list.head.next;
            list.head.next = list.head.prev;
            list.head.prev = now;
            if (now == null) {
                break;
            }
            list.head = now;
        }
        return list.head;
    }

    /////////////////

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        DoublyLinkedList lList = new DoublyLinkedList();

        int lListCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lListCount; i++) {
            int lListItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            lList.insertNode(lListItem);
        }
        DoublyLinkedListNode lList1 = reverse(lList);

        printDoublyLinkedList(lList1, " ");
        scanner.close();
    }
}
