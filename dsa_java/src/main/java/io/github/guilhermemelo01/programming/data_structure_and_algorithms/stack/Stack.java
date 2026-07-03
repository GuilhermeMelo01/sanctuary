package io.github.guilhermemelo01.programming.data_structure_and_algorithms.stack;


import io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private ListNode root;
    private int length;

    // STACK USING LINKED LIST

    public Stack() {
    }

    public void push(ListNode node) {
        node.next = this.root;
        this.root = node;
        this.length++;
    }

    public int pop() {
        ListNode node = this.root;
        this.root = this.root.next;
        this.length--;
        return node.val;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "root=" + root +
                ", length=" + length +
                '}';
    }

    public String reverseStringWithStack(String s) {
        String[] split = s.split("");
        java.util.Stack<String> stack = new java.util.Stack<>();

        for (int i = 0; i < split.length; i++) {
            stack.push(split[i]);
        }

        String value = "";
        while (!stack.isEmpty()) {
            value = value.concat(stack.pop());
        }

        return value;
    }

    public static List<Integer> nextGreaterElementInTheList(int[] elements) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {
                if (elements[i] < elements[j]) {
                    list.add(elements[j]);
                    break;
                }

                if (j == elements.length - 1) {
                    list.add(-1);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(new ListNode(5));
        stack.push(new ListNode(10));
        stack.push(new ListNode(12));
        stack.push(new ListNode(8));

        stack.pop();

        System.out.println(stack);

        String s = stack.reverseStringWithStack("Guilherme");
        System.out.println(s);

        System.out.println("==============");

        List<Integer> integers = nextGreaterElementInTheList(new int[]{4, 7, 3, 4, 8, 1});
        integers.forEach((i) -> System.out.print(i + " | "));
    }
}
