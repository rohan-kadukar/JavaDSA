package dsaCode;
import java.util.*;
public class Binary_Tree {
    static Node create(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        if (data==-1) {
            return null;
        }else{
            root=new Node(data);
            System.out.print("Enter left child of "+ root.data +" ==> ");
            root.left=create();
            System.out.print("Enter right child of "+ root.data +" ==> ");
            root.right=create();
        }
        return root;
    }
    static void inOrder(Node root){  //Left Node Right
        if (root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){  //Node Left Right
        if (root==null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){  //Left Right Node
        if (root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args){
        Node root=create();    //call the create method
        Scanner sc = new Scanner(System.in);
        int b;
        do {
            System.out.print("Enter 1 for inOrder , Enter 2 For Preorder , Enter 3 for postOrder: ");
            int a= sc.nextInt();
            switch (a){
                case 1:
                    inOrder(root);
                    break;
                case 2:
                    preOrder(root);
                    break;
                case 3:
                    postOrder(root);
                    break;
            }
            System.out.println();
            System.out.print("Enter 0 for menu: ");
            b= sc.nextInt();
        }while(b==0);
    }
}
class Node{
    int data;
    Node right,left;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
