package io.github.guilhermemelo01.programming.data_structure_and_algorithms.binary_tree;


import java.util.Stack;

public class BinaryTree {

    public TreeNode root;

    public static class TreeNode {

        private int data; // Generic Type
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
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

    public TreeNode insertInBinaryTreeSearch(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }

        if(value < root.data){
            root.left = insertInBinaryTreeSearch(root.left, value);
        }else{
            root.right = insertInBinaryTreeSearch(root.right, value);
        }

        return root;
    }

    public TreeNode searchInBinaryTreeSearch(TreeNode root, int key){
        if(root == null || root.data == key){
            return root;
        }

        if(key < root.data){
            return searchInBinaryTreeSearch(root.left, key);
        }else{
            return searchInBinaryTreeSearch(root.right, key);
        }
    }

    public void createBinaryTreeSearch(){
        TreeNode first = new TreeNode(0);
        TreeNode left_1 = new TreeNode(-3);
        TreeNode left_2 = new TreeNode(-5);

        TreeNode right_1 = new TreeNode(2);
        TreeNode right_1_left_1 = new TreeNode(1);
        TreeNode right_2 = new TreeNode(4);

        root = first; // root --> first
        first.left = left_1;
        left_1.left = left_2;

        first.right = right_1;
        right_1.left = right_1_left_1;
        right_1.right = right_2;
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);

        root = first; // root --> first
        first.left = second;
        first.right = third; // second <-- first --> third

        second.left = fourth;
        second.right = five;

        fourth.left = sixth;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){

        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void preOrderIterate(TreeNode root){

        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public void inOrderIterative(TreeNode root){
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.add(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    private static int findMaximumValueInBinaryTree(BinaryTree.TreeNode root, int biggest){
        if(root == null){
            return biggest;
        }

        if (root.getData() > biggest){
            biggest = root.getData();
        }
        biggest = findMaximumValueInBinaryTree(root.getLeft(), biggest);
        biggest = findMaximumValueInBinaryTree(root.getRight(), biggest);

        return biggest;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
//        bt.createBinaryTree();
//        bt.preOrder(bt.root);
//        System.out.println();
//        bt.preOrderIterate(bt.root);

//        bt.inOrder(bt.root);
//        System.out.println();
//        bt.inOrderIterative(bt.root);

//        bt.postOrder(bt.root);
//        System.out.println();
//        bt.inOrderIterative(bt.root);

//        int maximumValueInBinaryTree = findMaximumValueInBinaryTree(bt.root, Integer.MIN_VALUE);
//        System.out.println(maximumValueInBinaryTree);

        bt.createBinaryTreeSearch();

        bt.insertInBinaryTreeSearch(bt.root, 5);
        bt.inOrder(bt.root);
        System.out.println();

        TreeNode treeNode = bt.searchInBinaryTreeSearch(bt.root, 4);
        System.out.println(treeNode);
    }
}
