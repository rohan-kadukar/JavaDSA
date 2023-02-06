package dsaCode;
import java.util.*;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if (root==null){
            root=new Node(val);
            return root;
        }
        if (root.data > val){
            root.left = insert(root.left,val);
        } else {
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Boolean search(Node root,int key){
        if (root==null ){
            return false;
        }
        if (root.data>key){
            return search(root.left,key);
        }else if(root.data==key){
            return true;
        }else {
            return search(root.right,key);
        }
    }

    public static Node delete(Node root,int del){
        if (root.data > del){
            root.left = delete(root.left,del);
        }else if(root.data < del){
            root.right = delete(root.right,del);
        }else {  //root.data == del
            //case 1:
            if (root.left==null && root.right==null){
                return null;
            }
            //case 2:
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //case 3:
            Node IS = InorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node InorderSuccesor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void printInRange(Node root,int X,int Y){
        if (root==null){
            return;
        }
        if (root.data >= X && root.data <= Y ) {
            printInRange(root.left,X,Y);
            System.out.print(root.data+" ");
            printInRange(root.right,X,Y);
        } else if (root.data >= X) {
            printInRange(root.right,X,Y);
        }else {
            printInRange(root.left,X,Y);
        }
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if (root==null){
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null){
            for (int i=0;i< path.size();i++){
                System.out.print(path.get(i)+"->");
            }
            System.out.println();
        } else {
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = {4,2,3,5,1,6};
        Node root=null;
        for (int i=0;i<values.length;i++) {
            root = insert(root, values[i]);
        }
        System.out.print("Inorder BST is: ");
        inorder(root);
        System.out.println();
        System.out.print("Enter Search Key: ");
        int key = sc.nextInt();
        if (search(root,key)){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
        System.out.print("Enter deleting Node: ");
        int del= sc.nextInt();
        delete(root,del);

        inorder(root);

        System.out.println();
        System.out.print("printInRange: ");
        printInRange(root,3,6);

        System.out.println();
        System.out.println("printRoot2Leaf: ");
        printRoot2Leaf(root,new ArrayList<>());
    }
}
