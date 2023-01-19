package dsaCode;
import java.util.*;
public class DoublyDeletion {
    Scanner sc = new Scanner(System.in);
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
    public void deletion(){
        int m,p;
        Scanner sc=new Scanner(System.in);
        if (head==null){
            System.out.println("Linked List not Available");
        }else{
            System.out.println("Enter 1 to delete the item at beginning , 2 to delete item at the end , 3 to delete the item at perticular position: ");
            m=sc.nextInt();
            switch (m) {
                case 1 -> {
                     head=head.next;
                     head.prev=null;
                }
                case 2 -> {
                    Node temp=head;
                    Node ptr=temp.next;
                    while(ptr.next!=null) {
                        temp=temp.next;
                        ptr=ptr.next;
                    }
                    temp.next=null;
                    tail=temp;
                }
                case 3 -> {
                    System.out.print("Enter Position to delete item: ");
                    p = sc.nextInt();
                    Node temp2 = head;
                    Node ptr2 = temp2.next;
                    if (p==1){
                        head=head.next;
                        head.prev=null;
                    }else{
                        for (int i = 0; i < (p - 2); i++) {
                            temp2 = ptr2;
                            ptr2 = ptr2.next;
                        }
                        if (ptr2.next==null){
                            temp2.next=null;
                            tail=temp2;
                        }
                        else{
                            temp2.next = ptr2.next;
                            ptr2.prev=temp2;
                        }
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
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        DoublyDeletion dil=new DoublyDeletion();
        dil.creation();
        dil.deletion();
        dil.traverse();
    }
}
