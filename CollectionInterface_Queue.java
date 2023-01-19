package dsaCode;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class CollectionInterface_Queue {
    public static void main(String[] args) {
        /*
        //  Linked List  //
        Queue<Integer> ql=new LinkedList<>();
        ql.offer(200);  //to insert data(push)
        ql.offer(100);
        ql.offer(300);
//        System.out.println(ql);  //[200, 100, 300]
        System.out.println(ql.peek());  //200
        ql.poll();  //to delete data(pop)
        System.out.println(ql);  //[100, 300]
         */


        /*
        //  Priority Queue  //  MIN HEAP
        Queue<Integer> q=new PriorityQueue<>();
        q.offer(300);
        q.offer(100);
        q.offer(200);
        q.offer(400);
//        System.out.println(q);  //  [100, 300, 200, 400]
        q.poll();
        System.out.println(q);  //  [200, 300, 400]
        */


        //  Priority Queue  //  MAX HEAP
        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        q.offer(300);
        q.offer(100);
        q.offer(200);
        q.offer(400);
//        System.out.println(q);  //  [400, 300, 200, 100]
        q.poll();
        System.out.println(q);  //  [300, 100, 200]

    }
}
