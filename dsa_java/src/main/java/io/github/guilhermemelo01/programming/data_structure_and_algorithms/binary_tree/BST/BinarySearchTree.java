package io.github.guilhermemelo01.programming.data_structure_and_algorithms.binary_tree.BST;

import java.util.Stack;

public class BinarySearchTree {

    private TreeNode root;

    private static class TreeNode {
        private int data; // Could be generic type
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    /* @RECURSIVE
       Q. How to insert a value in a Binary Search Tree?
    */
    private static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    /* Q. HOW TO SEARCH A GIVEN KEY IN BST */
    private static TreeNode search(TreeNode root, int value){
        if(root == null || root.data == value){
            return root;
        }

        if(value < root.data){
            return search(root.left, value);
        }else{
            return search(root.right, value);
        }
    }

    /* Q. GIVEN THE ROOT OF A BINARY TREE, DETERMINE IF IT IS A VALID BINARY SEARCH TREE (BST) */
    private static boolean isValidBST(TreeNode root, Long min, Long max){
        if(root == null){
            return true;
        }
        // min < data < max
        if(root.data <= min || root.data >= max){
            return false;
        }

        boolean left = isValidBST(root.left, min, Long.valueOf(root.data));
        if(left){
            boolean right = isValidBST(root.right, Long.valueOf(root.data), max);
            return right;
        }

        return false;
    }

    /* Q. Given the root of a binary tree, check whether it is a mirror of itself. */
    private static boolean isSymmetricBT(TreeNode root){
        if(root == null){
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.isEmpty()){
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();

            if(n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null || n1.data != n2.data) return false;

            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }

        return true;
    }

    /* PREORDER */
    private static void printPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " - ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    /* INORDER */
    private static void printInOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data + " - ");
        printInOrder(root.right);
    }

    /* POSORDER */
    private static void printPosOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        printPosOrder(root.left);
        printPosOrder(root.right);
        System.out.print(root.data + " - ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        //        insert(root, 8);
//        insert(root, 12);
//        printPreOrder(root);
//        printInOrder(root);
//        printPosOrder(root);
//        TreeNode finded = search(root, 11);
//        System.out.println(finded);


//        boolean validBST = isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
//        System.out.println(validBST);

        boolean symmetricBT = isSymmetricBT(root);
        System.out.println(symmetricBT);
    }
}
