package dsaCode;
import java.util.*;
public class QueueLL{
  Scanner sc = new Scanner(System.in);
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  Node front=null,rear=null;
  public void enQueue(){
    int data;
    System.out.print("Enter data: ");
    data=sc.nextInt();
    Node new_node=new Node(data);
    if(rear==null){
      front=rear=new_node;
    }else{
      rear.next=new_node;
      rear=new_node;
    }
  }
  public void deQueue(){
    if(front==null){
      System.out.println("Queue is UnderFlow.");
    }else{
      front=front.next;
      if(front==null){
        rear=null;
      }
    }
  }
  public void disp(){
    if(front==null){
      System.out.println("Queue Not Exist.");
    }else{
      Node temp=front;
      while(temp!=rear.next){
        System.out.println(temp.data);
        temp=temp.next;
      }
    }
  }
  public static void main (String[] args) {
    QueueLL q=new QueueLL();
    Scanner sc= new Scanner(System.in);
    int i;
    do{
      System.out.print("Enter 1 for enQueue, Enter 2 for deQueue & Enter 3 for Display: ");
      int ch=sc.nextInt();
      switch(ch){
        case 1:
          q.enQueue();
          break;
        case 2:
          q.deQueue();
          break;
        case 3:
          q.disp();
          break;
      }
      System.out.print("Enter 1 for menu: ");
      i = sc.nextInt();
    }while(i==1);
  }
}