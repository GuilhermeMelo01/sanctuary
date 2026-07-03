package io.github.guilhermemelo01.programming.data_structure_and_algorithms.linkedlist.base;

public class SinglyLinkedList {

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(10);
        Node<Integer> first = new Node<>(8);
        Node<Integer> second = new Node<>(1);
        Node<Integer> third = new Node<>(11);
        head.setNext(first);
        first.setNext(second);
        second.setNext(third);

        printValuesNode(head);

//        Integer lengthNode = findLengthNode(head);
//        System.out.println("Length: "+ lengthNode);

        System.out.println("----INSERT FIRST POSITION----");
        head = insertNewNodeAtFirstPosition(new Node<>(243), head);
        printValuesNode(head);

        System.out.println("----INSERT LAST POSITION----");
        head = insertNewNodeAtLastPosition(new Node<>(111), head);
        printValuesNode(head);

        System.out.println("----INSERT IN GIVEN POSITION----");
        head = insertNewNodeInGivePosition(new Node<>(439), head, 3);
        printValuesNode(head);

        System.out.println("----DELETE FIRST NODE----");
        head = deleteFirstNode(head);
        printValuesNode(head);

        System.out.println("----DELETE LAST NODE----");
        head = deleteLastNode(head);
        printValuesNode(head);

        System.out.println("----DELETE FROM GIVEN POSITION----");
        head = deleteNodeFromGivenPositionDummyHead(head, 1);
        printValuesNode(head);

        System.out.println("----DELETE FROM KEY ----");
        head = deleteNodeFromGivenValue(head, 10);
        printValuesNode(head);

        Node<Integer> headSorted = new Node<>(1);
        Node<Integer> firstSorted = new Node<>(2);
        Node<Integer> secondSorted = new Node<>(2);
        Node<Integer> thirdSorted = new Node<>(10);
        Node<Integer> fourSorted = new Node<>(21);
        headSorted.setNext(firstSorted);
        firstSorted.setNext(secondSorted);
        secondSorted.setNext(thirdSorted);
        thirdSorted.setNext(fourSorted);

//        System.out.println("----INSERT INSIDE OF A SORTED LINKED LIST ----");
//        headSorted = insertNodeInSortedLinkedList(headSorted, new Node<>(10));
//        printValuesNode(headSorted);
//
//        System.out.println("----REMOVE DUPLICATES NODES FROM SORTED LINKED LIST ----");
//        headSorted = removeDuplicateNodesFromSortedLinkedList(headSorted);
//        printValuesNode(headSorted);
//
//        System.out.println("----SEARCH VALUE IN LINKED LIST ----");
//        boolean exist = searchValueInLinkedList(headSorted, 3);
//        System.out.println(exist);
//
//        System.out.println("----REVERSED LINKED LIST ----");
//        Node<Integer> reversedLinkedList = reversedLinkedList(headSorted);
//        printValuesNode(reversedLinkedList);
//
//        System.out.println("----LAST IN THE LINKED LIST ----");
//        Node<Integer> last = lastInTheList(headSorted);
//        printValuesNode(last);

        System.out.println("---------------");
        printValuesNode(headSorted);

//        System.out.println("----MIDDLE NODE IN THE LINKED LIST ----");
//        Node<Integer> findMiddleNode = findMiddleNode(headSorted);
//        printValuesNode(findMiddleNode);

        System.out.println("----FIND NTH NODE IN THE LINKED LIST ----");
        Node<Integer> findNth = findNthNodeFromEndOfTheList(headSorted, 4);
        printValuesNode(findNth);


        Node<Integer> headLoop = new Node<>(1);
        Node<Integer> firstLoop = new Node<>(2);
        Node<Integer> secondLoop = new Node<>(3);
        Node<Integer> thirdLoop = new Node<>(4);
        Node<Integer> fourLoop = new Node<>(5);
        Node<Integer> fiveLoop = new Node<>(6);

        headLoop.setNext(firstLoop);
        firstLoop.setNext(secondLoop);
        secondLoop.setNext(thirdLoop);
        thirdLoop.setNext(fourLoop);
        fourLoop.setNext(fiveLoop);
        fiveLoop.setNext(secondLoop);

        System.out.println("---HAS LOOP INSIDE OF THE LINKED LIST ----");
        Boolean hasLoop = hasLoopInsideOfLinkedList(headLoop);
        System.out.println("Has loop in the Linked List: "+ hasLoop);

        System.out.println("----GET STARTED NODE IF HAS LOOP IN THE LINKED LIST ----");
        Node<Integer> startedNode = getStartedNodeIfHasLoop(headLoop);
        printValuesNodeOfLoopNodeStartedFromStartedNode(startedNode);

    }

    public static Node<Integer> getStartedNodeIfHasLoop(Node<Integer> head){

        Node<Integer> slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return getStartedNode(head, slow);
            }
        }
        return null;
    }

    public static Node<Integer> getStartedNode(Node<Integer> head, Node<Integer> slow){
        Node<Integer> temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }

        return temp;
    }

    public static Boolean hasLoopInsideOfLinkedList(Node<Integer> head){

        if (head == null){
            return null;
        }

        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static Node<Integer> lastInTheList(Node<Integer> head){

        if (head == null){
            return null;
        }

        Node<Integer> current = head;
        Node<Integer> previous = null;

        while(current != null){
            previous = current;
            current = current.next;

        }

        return previous;
    }

    public static Node<Integer> findMiddleNode(Node<Integer> head){

        if (head == null){
            return null;
        }

        if (head.next == null){
            return head;
        }

        Node<Integer> slow = head, fast = head.next;
        while(fast != null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;

    }

    public static Node<Integer> findNthNodeFromEndOfTheList(Node<Integer> head, int position){

        if (head == null){
            return null;
        }

        if (head.next == null){
            return head;
        }

        /*
         * I could do the follow thing:
         * I will take the position and do awhile until position is equal to 0, and point this node to fast.
         * Now, I'm gonna take the node slow = head, node fast and node previous that will stay behind node slow.
         * When the fast node be equal to null, I'm gonna take previous.next to slow.next and return head.
         *
         * */

        Node<Integer> fast = head;
        while(fast != null && position != 0){
            fast = fast.next;
            position--;
        }

        Node<Integer> slow = head;

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    public static Node<Integer> reversedLinkedList(Node<Integer> head){

        if (head == null){
            return null;
        }

        Node<Integer> current = head;
        Node<Integer> next = null;
        Node<Integer> previous = null;

        /**
         * <- 1 <- 2 <- 4 <- 5
         *                     c
         *                     n
         *                   p -> RETURN
         * c.next = 1
         * */

       while(current != null){
           next = current.next;
           current.next = previous;
           previous = current;
           current = next;
       }

        return previous;
    }

    public static boolean searchValueInLinkedList(Node<Integer> head, int value){
        if (head == null){
            return false;
        }

        Node<Integer> current = head;
        while(current != null){
            if (current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static Node<Integer> removeDuplicateNodesFromSortedLinkedList(Node<Integer> head){
        if (head == null){
            return null;
        }
        /** newNode = 3
         *   w
         * 1 2 3 3 null
         *          c
         *     p    n
         * */

        Node<Integer> current = head;
        Node<Integer> previous = null;
        while(current != null){
            if (previous != null && current.data == previous.data){
                previous.next = current.next;
                current = current.next;
            }else{
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

    public static Node<Integer> insertNodeInSortedLinkedList(Node<Integer> head, Node<Integer> newNode){
            if (head == null){
                return null;
            }

            /** newNode = 3
             *   w
             * 1 2 5 6
             *     c
             *   t
             * */
            Node<Integer> current = head;
            Node<Integer> temp = null;
            while (current.data != null && current.data < newNode.data){
                temp = current;
                current = current.next;
            }
            temp.next = newNode;
            newNode.next = current;
            return head;
    }

    public static Node<Integer> deleteNodeFromGivenValue(Node<Integer> head, int value) {
        if (head == null) {
            return null;
        }

        Node<Integer> current = head;
        Node<Integer> previous = null;
        if (current.data == value) {
           return current.next;
        } else {
            while (current.next != null) {
                Node<Integer> temp = current;
                if (current.data == value) {
                    previous.next = current.next;
                    current = previous;
                    break;
                } else {
                    current = current.next;
                    previous = temp;
                }
            }
        }

        return head;
    }

    public static Node<Integer> deleteNodeFromGivenPosition(Node<Integer> head, int position) {
        if (head == null) {
            return head;
        }

        if (position == 1) {
            head = head.next;
        } else {
            Node<Integer> previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            Node<Integer> current = previous.next;
            previous.next = current.next;
        }

        return head;
    }

    public static Node<Integer> deleteNodeFromGivenPositionDummyHead(Node<Integer> head, int position) {
        // 1- Create a dummy head with -1 value and point next to head
        // 2- We've to create a left pointer = head and right pointer that is equal to position
        // 3- We've to create a loop until the right pointer == null
        // 4- When the right pointer is null, we point the left.next pointer to right.next;
        // 5- return the dummy.next

        Node<Integer> dummy = new Node<>(-1, head);
        Node<Integer> right = head;

        while(position > 0 && right != null){
            right = right.next;
            position--;
        }

        dummy.next = dummy.next.next;

        return dummy.next;
    }

    public static Node<Integer> deleteLastNode(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> current = head;
        Node<Integer> previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return head;
    }

    public static Node<Integer> deleteFirstNode(Node<Integer> head) {

        if (head == null) {
            return null;
        }

        Node<Integer> temp = head;
        head = head.next;
        temp.next = null;

        return head;
    }

    public static Node<Integer> insertNewNodeInGivePosition(Node<Integer> newNode, Node<Integer> head, int position) {

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        } else {
            Node<Integer> previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            Node<Integer> current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }

        return head;
    }

    public static Node<Integer> insertNewNodeAtLastPosition(Node<Integer> newNode, Node<Integer> currentHead) {
        if (currentHead.data == null) {
            currentHead = newNode;
            return currentHead;
        }

        Node<Integer> currentNode = currentHead;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return currentHead;
    }

    public static Node<Integer> insertNewNodeAtFirstPosition(Node<Integer> newNode, Node<Integer> currentHead) {
        newNode.setNext(currentHead);
        currentHead = newNode;
        return currentHead;
    }

    public static Integer findLengthNode(Node<Integer> head) {
        Node<Integer> current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void printValuesNode(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.getData() + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void printValuesNodeOfLoopNodeStartedFromStartedNode(Node<Integer> head) {
        Node<Integer> first = null;
        Node<Integer> current = head;
        while (current != null && first != current) {
            if (current == head){
                first = current;
            }
            System.out.print(current.getData() + " --> ");
            current = current.next;
        }
        System.out.println(first.getData() + " <-- first");
    }

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

//        @Override
//        public String toString() {
//            return "Node{" +
//                    "data=" + data +
//                    ", next=" + next +
//                    '}';
//        }
    }

}
