package dsaCode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class CollectionInterface_List {
    public static void main(String[] args) {
        /*
        // Array List //
        List<Integer> al=new ArrayList<>();
        al.add(300);
        al.add(200);
        al.add(100);
        al.add(400);
//        System.out.println(al); //[300, 200, 100, 400]
        al.remove(1);
//        System.out.println(al);  //[300, 100, 400]
        int val=al.get(2);
//        System.out.println(val);  //400
        al.set(1,350);
//        System.out.println(al);  //[300, 350, 400]
        boolean check=al.contains(300);
//        System.out.println(check);  //true
        al.clear();
//        System.out.println(al);  //[]
         */


        /*
        // Linked List //
        List<Integer> ll=new LinkedList<>();
        ll.add(300);
        ll.add(200);
        ll.add(100);
        ll.add(400);
//        System.out.println(ll); //[300, 200, 100, 400]
        ll.remove(1);
//        System.out.println(ll);  //[300, 100, 400]
        int val=ll.get(2);
//        System.out.println(val);  //400
        ll.set(1,350);
//        System.out.println(ll);  //[300, 350, 400]
        boolean check=ll.contains(300);
//        System.out.println(check);  //true
        l.clear();
//        System.out.println(ll);  //[]
         */

        // Stack //
        Stack<Integer> s=new Stack<>();
        s.push(200);
        s.push(100);
        s.push(300);
//        System.out.println(s);  //[200, 100, 300]
        s.pop();
//        System.out.println(s);  //[200, 100]
        int peek=s.peek();
//        System.out.println(peek);  //100
        int search=s.search(100);
//        System.out.println(search);  //1
        boolean a=s.isEmpty();
//        System.out.println(a);  //false
    }
}
