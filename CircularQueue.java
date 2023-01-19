package dsaCode;
import java.util.*;
class C_queue {
    Scanner sc= new Scanner(System.in);
    int n=3;
    int[] a = new int[n];
    int f=-1;
    int r=-1;
    public void enQueue(){
        if (f==(r+1)%n){
            System.out.println("Queue is OverFlow.");
        } else if (f==-1 && r==-1) {
            f=0;
            r=0;
            System.out.print("Enter data: ");
            int data=sc.nextInt();
            a[r]=data;
        } else{
            System.out.print("Enter data: ");
            int data=sc.nextInt();
            r=(r+1)%n;
            a[r]=data;
        }
    }
    public void deQueue(){
        if (f==r) {
            System.out.println("Queue is UnderFlow.");
            a[f]=0;
            f=-1;
        }else{
            a[f]=0;
            f=(f+1)%n;
        }
    }
    public void disp(){
        int exit=0;
        if (f==-1 || r==-1){
            System.out.println("Circular Queue Not Exist");
        }else{
            System.out.print("Queue is: ");
            for (int i=f;true;i=((i+1)%n)){
                System.out.print(a[i]+" ");
                exit+=1;
                if (exit==n){
                    break;
                }
            }
            System.out.println();
        }
    }
}
public class CircularQueue {
    public static void main (String[] args) {
        C_queue q=new C_queue();
        Scanner sc= new Scanner(System.in);
        int i;
        do{
            System.out.print("Enter 1 for enQueue, Enter 2 for deQueue & Enter 3 for Display: ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1 -> q.enQueue();
                case 2 -> q.deQueue();
                case 3 -> q.disp();
            }
            System.out.print("Enter 1 for menu: ");
            i = sc.nextInt();
        }while(i==1);
    }
}

