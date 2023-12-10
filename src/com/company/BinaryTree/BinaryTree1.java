package com.company.BinaryTree;

public class BinaryTree1 {
    static class Node{

        //Node class will represent each node of a tree
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data    = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreeClass{
        static int idx = -1;
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx] == -1)
                return null;

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }


    }

    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTreeClass tree = new BinaryTreeClass();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.right);
//        System.out.println(root.data);

        preorder(root);
    }
}