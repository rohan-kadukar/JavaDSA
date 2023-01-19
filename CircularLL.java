package dsaCode;
import java.util.*;
public class CircularLL {
    Scanner sc = new Scanner(System.in);
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head=null;
    Node tail=null;
    public void creation(){
        int data,n;
        do{
            System.out.print("Enter data: ");
            data= sc.nextInt();
            Node new_node=new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
                new_node.next=head;
            }else{
                new_node.next=head;
                head=new_node;
                tail.next=head;
            }
            System.out.print("For Entering another data enter 1: ");
            n= sc.nextInt();
        }while(n==1);
    }
    public void traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked List not Available");
        }else{
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }while(temp!=head);
        }
    }
    public static void main(String[] args){
        CircularLL cll=new CircularLL();
        cll.creation();
        cll.traverse();
    }
}
