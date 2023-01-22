package dsaCode;
import java.util.*;
public class BT_Operations {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node new_node = new Node(nodes[idx]);
            new_node.left = buildTree(nodes);
            new_node.right = buildTree(nodes);
            return new_node;
        }
    }

    public static void inorder(Node root){
        if (root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void preorder(Node root){
        if (root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if (root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelorder(Node root){
        if (root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr_node = q.remove();
            if (curr_node == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr_node.data+" ");
                if (curr_node.left!=null){
                    q.add(curr_node.left);
                }
                if (curr_node.right!=null){
                    q.add(curr_node.right);
                }
            }
        }
    }
    public static int countOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftNodes=countOfNodes(root.left);
        int rightNodes=countOfNodes(root.right);

        return leftNodes+rightNodes+1;
    }

    public static int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public static int height(Node root){
        if (root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight,rightHeight)+1;

        return myHeight;
    }

    public static int diameter(Node root){  //No of nodes in the Longest path between any 2 nodes
        if (root==null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left)+height(root.right)+1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }

    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        Node root = tree.buildTree(nodes);
        //        System.out.println(root.data);
        System.out.print("Inorder: ");
        inorder(root);
        System.out.print("\nPreorder: ");
        preorder(root);
        System.out.print("\nPostorder: ");
        postorder(root);
        System.out.println();
        System.out.println("Levelorder is: ");
        levelorder(root);
        System.out.println("No of nodes is: "+countOfNodes(root));
        System.out.println("Sum of nodes is: "+sumOfNodes(root));
        System.out.println("Height of tree is: "+height(root));
        System.out.println("Diameter of tree is: "+diameter(root));
    }
}
