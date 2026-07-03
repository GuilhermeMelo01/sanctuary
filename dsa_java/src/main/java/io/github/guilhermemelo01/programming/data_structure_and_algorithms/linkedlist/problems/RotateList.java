package io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems;

import io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems.listnode.ListNode;

public class RotateList {

    public static void main(String[] args) {
//        [1,2,3,4,5]

        ListNode listNode = rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2);
        System.out.println(listNode);

    }
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(-1,head);
        ListNode left = dummy;
        ListNode right = head;
        ListNode target = head;
        while(k > 0 && right != null){
            right = right.next;
            k--;
        }

        while(right != null){
            right = right.next;
            left = left.next;
        }
        target = left.next;
        left.next = null;


        ListNode last = target;
        while(last != null){
            if(last.next == null){
                last.next = dummy.next;
                break;
            }
            last = last.next;
        }

        return target;
    }
}
