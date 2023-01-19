package dsaCode;
import java.util.*;
class queueA {
  Scanner sc= new Scanner(System.in);
  int n=5;
  int a[] = new int[n];
  int f=-1;
  int r=-1;
  public void enQueue(){
    if (r==(n-1)){
      System.out.println("Queue is OverFlow.");
    }else{
      System.out.print("Enter data: ");
      int data=sc.nextInt();
      if(f==-1 && r==-1){
        f=r=0;
        a[r]=data;
      }else{
        r=(r+1)%n;
        a[r]=data;
      }
    }
  }
  public void deQueue(){
    if (f==r) {
      System.out.println("Queue is UnderFlow.");
    }else{
      f+=1;
    }
  }
  public void disp(){
    int temp=f;
    while(temp!=(r)){
      temp+=1;
      System.out.println(a[temp]);
      
    }
  }
}
public class QueueArray{
  public static void main (String[] args) {
    queueA q=new queueA();
    Scanner sc= new Scanner(System.in);
    int i;
    do{
      System.out.println("Enter 1 for enQueue, Enter 2 for deQueue & Enter 3 for Display");
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