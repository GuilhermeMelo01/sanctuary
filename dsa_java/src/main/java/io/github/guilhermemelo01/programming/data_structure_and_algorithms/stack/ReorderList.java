package io.github.guilhermemelo01.programming.data_structure_and_algorithms.stack;

import io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        head.next = first;
        first.next = second;
        second.next = third;
        reorderList(head);
    }

    public static void reorderList(ListNode head) {
        java.util.Stack<ListNode> stack1 = new java.util.Stack<>();
        java.util.Stack<ListNode> stack2 = new java.util.Stack<>();

        int size = 0;
        ListNode root = head;
        while(head != null){
            size++;
            head = head.next;
        }

        int mid = (int) Math.ceil(size / 2);
        int count = 0;
        ListNode midNode = null;
        while(count < mid){
            stack1.push(root);
            midNode = root.next;
            count++;
        }

        midNode = midNode.next;
        while(midNode!= null){
            stack2.push(midNode);
            midNode = midNode.next;
        }

        ListNode retorno = null;
        List<ListNode> list = new ArrayList<>();
        while(!stack1.isEmpty()){
            list.add(stack1.pop());
            if(!stack2.isEmpty()){
                list.add(stack2.pop());
            }
        }

        for(int i = 0; i < list.size(); i++){
            if(i == 0){
                retorno = list.get(i);
            }else{
                retorno.next = list.get(i);
            }
        }

        head = retorno;
    }
}
