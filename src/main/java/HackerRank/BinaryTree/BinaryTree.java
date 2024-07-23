package HackerRank.BinaryTree;


import java.util.*;


public class BinaryTree{
    public static int getHeight(Node root){
        return 0;
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node current;
            if(data<=root.data){
                current=insert(root.left,data);
                root.left=current;
            } else{
                current=insert(root.right,data);
                root.right=current;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}