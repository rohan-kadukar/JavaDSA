package dsaCode;
import java.util.*;
public class CircularDeletion {
    Scanner sc=new Scanner(System.in);
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
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
    public void deletion(){
        int m,p;
        if (head==null){
            System.out.println("Linked List not Available");
        }else{
            System.out.println("Enter 1 to delete the item at beginning , 2 to delete item at the end , 3 to delete the item at perticular position: ");
            m=sc.nextInt();
            switch (m) {
                case 1 -> {
                    Node temp = head;
                    head = temp.next;
                    tail.next = head;
                }
                case 2 -> {
                    Node temp1 = head;
                    Node ptr1 = temp1.next;
                    while (ptr1.next != head) {
                        temp1 = temp1.next;
                        ptr1 = ptr1.next;
                    }
                    temp1.next = head;
                    tail = temp1;
                }
                case 3 -> {
                    System.out.print("Enter Position to delete item: ");
                    p = sc.nextInt();
                    Node temp2 = head;
                    Node ptr2 = temp2.next;
                    if (p == 1) {
                        head = temp2.next;
                        tail.next = head;
                    } else {
                        for (int i = 0; i < (p - 2); i++) {
                            temp2 = ptr2;
                            ptr2 = ptr2.next;
                        }
                        if (ptr2.next == head) {
                            temp2.next = head;
                            tail = temp2;
                        }
                        temp2.next = ptr2.next;
                    }
                }
            }
        }
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
        CircularDeletion cdl=new CircularDeletion();
        cdl.creation();
        cdl.deletion();
        cdl.traverse();


    }
}
