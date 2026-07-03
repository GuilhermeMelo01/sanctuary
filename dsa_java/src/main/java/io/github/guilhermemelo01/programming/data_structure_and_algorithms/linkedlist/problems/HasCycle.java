package io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems;

import io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems.listnode.ListNode;

public class HasCycle {

    public static void main(String[] args) {
        boolean has = hasCycle(new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4)))));
        System.out.println(has);
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }

        return false;
    }
}
