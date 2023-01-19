package dsaCode;
import java.util.*;
class Stack_L {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public void push() {
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data: ");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if (top != null) {
            new_node.next = top;
        }
        top = new_node;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is UnderFlow.");
        } else {
            Node temp = top;
            top = temp.next;
        }
    }

    public void disp() {
        Node temp1 = top;
        if (top == null) {
            System.out.println("Linked List not Available");
        } else {
            while (temp1 != null) {
                System.out.println(temp1.data);
                temp1 = temp1.next;
            }
        }
    }
}
public class Stack_LL{
    public static void main(String[] args) {
        Stack_L s = new Stack_L();
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.print("Enter 1 for Inserting Element,Enter 2 for Deleting Element & Enter 3 for Displaing Stack: ");
            int p = sc.nextInt();
            switch (p) {
                case 1 -> s.push();
                case 2 -> s.pop();
                case 3 -> s.disp();
            }
            System.out.print("If you want menu then hit 1: ");
            i = sc.nextInt();
        } while (i == 1);
    }
}
