package dsaCode;
import java.util.*;
public class DoublyLL {
    Scanner sc=new Scanner(System.in);
    static class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
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
            }else{
                new_node.next=head;
                head.prev=new_node;
                head=new_node;
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
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        DoublyLL dll=new DoublyLL();
        dll.creation();
        dll.traverse();
    }
}
