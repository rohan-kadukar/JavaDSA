package dsaCode;
import java.util.*;
public class SinglyInsert{
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
        int data,n,m;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter Data: ");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if (head==null){
                head=new_node;
            }else{
                System.out.println("Enter 1 to insert the item at beginning , 2 to insert item at the end , 3 to insert the item at perticular position: ");
                m=sc.nextInt();
                switch(m){
                    case 1:
                        new_node.next=head;
                        head=new_node;
                        break;
                    case 2:
                        Node temp=head;
                        while(temp.next!=null){
                            temp=temp.next;
                        }
                        temp.next=new_node;
                        break;
                    case 3:
                        int p;
                        System.out.print("Enter position of node to be inserted: ");
                        p=sc.nextInt();
                        Node temp1=head;
                        if (p==1){
                            new_node.next=head;
                            head=new_node;
                        }else{
                            for(int i=0;i<(p-2);i++){
                                temp1=temp1.next;
                            }
                            new_node.next=temp1.next;
                            temp1.next=new_node;
                        }
                        break;
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
        SinglyInsert ll = new SinglyInsert();
        ll.creation();
        ll.traverse();
    }
}
