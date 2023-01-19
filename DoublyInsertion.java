package dsaCode;
import java.util.*;
public class DoublyInsertion {
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
    public void insertion(){
        int data,n,m;
        do{
            System.out.print("Enter Data: ");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
            }else{
                System.out.println("Enter 1 to insert the item at beginning , 2 to insert item at the end , 3 to insert the item at perticular position: ");
                m=sc.nextInt();
                switch (m) {
                    case 1 -> {
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;
                    }
                    case 2 -> {
                        //Using tail
                        /*
                        tail.next=new_node;
                        new_node.prev=tail;
                        tail=new_node;
                        */

                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        new_node.prev = temp;
                        tail = new_node;
                    }
                    case 3 -> {
                        int p;
                        System.out.print("Enter position of node to be inserted: ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        Node ptr1=temp1.next;
                        if (p == 1) {
                            head.prev=new_node;
                            new_node.next = head;
                            head = new_node;
                        } else {
                            for (int i = 0; i < (p - 2); i++) {
                                temp1 = temp1.next;
                                ptr1=ptr1.next;
                            }
                            if (ptr1==tail){
                                tail.next=new_node;
                                new_node.prev=tail;
                                tail=new_node;
                            }else{
                                temp1.next=new_node;
                                new_node.prev=temp1;
                                new_node.next=ptr1;
                                ptr1.prev=new_node;
                            }
                        }
                    }
                }
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
        DoublyInsertion dil=new DoublyInsertion();
        dil.insertion();
        dil.traverse();
    }

}
