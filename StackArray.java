package dsaCode;
import java.util.*;
class Stack{
    Scanner sc=new Scanner(System.in);
    int top=-1;
    int n=5;
    int a[]=new int[n];
    public void push(){
        int data;
        System.out.print("Enter data: ");
        data=sc.nextInt();
        if (top==(n-1)){
            System.out.println("OverFlow Stack.");
        }else{
            top+=1;
            a[top]=data;
        }
    }
    public void pop(){
        if (top==-1){
            System.out.println("UnderFlow Stack.");
        }else{
            top-=1;
        }
    }
    public void disp(){
        for (int i=0;i<=top;i++){
            System.out.println(a[i]);
        }
    }
}
public class StackArray {
    public static void main(String[] args){
        Stack s=new Stack();
        Scanner sc=new Scanner(System.in);
        int i;
        do {
            System.out.print("Enter 1 for Inserting Element,Enter 2 for Deleting Element & Enter 3 for Displaing Stack: ");
            int p= sc.nextInt();
            switch (p){
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.disp();
                    break;
            }
            System.out.print("If you want menu then hit 1: ");
            i= sc.nextInt();
        }while(i==1);
    }
}
