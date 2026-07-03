package io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems;

import io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems.listnode.ListNode;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        ListNode listNode = deleteMiddle(new ListNode(1, null));
        System.out.println(listNode);
    }
    public static ListNode deleteMiddle(ListNode head){

        if (head == null)
            return null;

        if (head.next == null)
            return null;

        int size = 0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            size++;
        }

        int middle = Math.floorDiv(size, 2);

        ListNode actual = head;
        ListNode next = null;
        ListNode previous = null;
        while(middle != 0){
            previous = actual;
            actual = actual.next;
            middle--;
        }

        previous.next = actual.next;

        return head;
    }
}
