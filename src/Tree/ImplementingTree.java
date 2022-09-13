package Tree;

import java.util.Stack;

public class ImplementingTree {

    private Node root;

    private static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data = data;
        }
    }

//    Method to Creating a Tree
    public void createBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        root = first;  //root --> first;

        // second <----- first -----> third.
        first.left = second;
        first.right = third;

        // fourth <------ second -------> fifth.
        second.left = fourth;
        second.right = fifth;
    }
//Traversing the Binary Tree using Recursive Method.
    public void preOrderTraversal(Node root){

        if(root == null) return;

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

//    Iterative Method to Travers a Binary Tree
    public void iterativeTraversal(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        System.out.println();
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.print(temp.data + " ");

            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        ImplementingTree tree = new ImplementingTree();
        tree.createBinaryTree();
        tree.preOrderTraversal(tree.root);
        tree.iterativeTraversal(tree.root);
    }
}
