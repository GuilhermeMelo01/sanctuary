package io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems;

import io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.problems.listnode.ListNode;

import java.io.IOException;
import java.util.Scanner;

public class InsertGreatestCommonDivisors {

    public static void main(String[] args) throws IOException {
//        ListNode head = new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3, null))));
//        ListNode listNode = insertGreatestCommonDivisors(head);
//        System.out.println(listNode);
        Scanner scanner = new Scanner(System.in);
        Integer cases = scanner.nextInt();

        while(cases > 0){
            int number = scanner.nextInt();
            Integer halfOfNumber = number/2;
            Integer sum = 0;

            for(int i = halfOfNumber; i >= 1; i--){
                if(number % i == 0){
                    sum += i;
                }
            }

            if(sum == number){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            cases--;
        }
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode node = head;
        while (node.next != null) {
            int nodeValue = node.val;
            int nextNodeValue = node.next.val;
            int minimunValueBetween = nodeValue < nextNodeValue ? nodeValue : nextNodeValue;

            for (int i = minimunValueBetween; i > 0; i--) {
                if (nodeValue % i == 0 && nextNodeValue % i == 0) {
                    ListNode newNode = new ListNode(i, node.next);
                    node.next = newNode;
                    node = newNode.next;
                    break;
                }
            }
        }
        return head;
    }
}
