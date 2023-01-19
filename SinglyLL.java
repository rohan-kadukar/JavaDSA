package dsaCode;
import java.util.*;
public class SinglyLL{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node head = null;
        public void creation(){
            int data,n;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.print("Enter Data: ");
                data=sc.nextInt();
                Node new_node=new Node(data);
                if (head==null){
                    head=new_node;
                }else{
                    new_node.next=head;
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
            SinglyLL ll = new SinglyLL();
            ll.creation();
            ll.traverse();
        }
    }
