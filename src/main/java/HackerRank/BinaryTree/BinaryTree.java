package HackerRank.BinaryTree;


import java.util.*;


public class BinaryTree{
    private static Node root; // the tree root


    public static int getHeight(Node root){
        if(root == null) {
            return -1;
        } else {
            return 1 + Math.max(getHeight(root.left),getHeight(root.right));
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            if(data<=root.data){
                root.left = insert(root.left,data);
            } else{
                root.right = insert(root.right,data);
            }
            return root;
        }
    }

    public static void traverse(Node root) {
        if(root != null) {
            traverse(root.left);
            System.out.print(root.data + " ");
            traverse(root.right);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        System.out.println("Traversal the tree:");
        traverse(root);
        System.out.println();

        int height=getHeight(root);
        System.out.println("The tree height: " + height);
    }
}