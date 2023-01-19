package dsaCode;
import java.util.*;
public class CircularInsertion {
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
        int data,n,m,p;

        do{
            System.out.print("Enter data: ");
            data= sc.nextInt();
            Node new_node=new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
                new_node.next=tail;
            }else{
                System.out.println("Enter 1 to insert the item at beginning , 2 to insert item at the end , 3 to insert the item at perticular position: ");
                m=sc.nextInt();
                switch (m) {
                    case 1 -> {
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                    }
                    case 2 -> {
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                    }
                    case 3 -> {
                        Node temp = head;
                        System.out.print("Enter Position For Inserting Item( NOT ALLOW 1): ");
                        p = sc.nextInt();
                        for (int i = 0; i < (p - 2); i++) {
                            temp = temp.next;
                        }
                        new_node.next = temp.next;
                        temp.next = new_node;
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
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }while(temp!=head);
        }
    }
    public static void main(String[] args){
        CircularInsertion cll=new CircularInsertion();
        cll.creation();
        cll.traverse();
    }
}
