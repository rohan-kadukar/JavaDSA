package dsaCode;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionInterface_Set {
    public static void main(String[] args) {
        /*
        // HashSet  //
        Set<Integer> h = new HashSet<Integer>();
        h.add(300);
        h.add(100);
        h.add(200);
        h.add(400);
//        System.out.println(h);  //  [400, 100, 200, 300]        INORDERED
        h.remove(400);
//        System.out.println(h);  //  [100, 200, 300]
        boolean cont=h.contains(100);
//        System.out.println(cont);  //  true
        int size=h.size();
//        System.out.println(size);  //  3
        h.clear();
        System.out.println(h);  //  []
        */

        /*
        //  Linked HashSet  //
        Set<Integer> lh = new LinkedHashSet<>();
        lh.add(300);
        lh.add(100);
        lh.add(200);
        lh.add(400);
//        System.out.println(lh);  //  [300, 100, 200, 400]        INORDERED
        lh.remove(400);
//        System.out.println(lh);  //  [300, 100, 200]
        boolean cont=lh.contains(100);
//        System.out.println(cont);  //  true
        int size=lh.size();
//        System.out.println(size);  //  3
        lh.clear();
        System.out.println(lh);  //  []
        */

        Set<Integer> t=new TreeSet<>();
        t.add(300);
        t.add(100);
        t.add(200);
        t.add(400);
//        System.out.println(t);  //  [100, 200, 300, 400]        INORDERED
        t.remove(400);
//        System.out.println(t);  //  [100, 200, 300]
        boolean cont=t.contains(100);
//        System.out.println(cont);  //  true
        int size=t.size();
//        System.out.println(size);  //  3
        t.clear();
        System.out.println(t);  //  []
    }
}
