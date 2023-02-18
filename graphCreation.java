package dsaCode;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;

public class graphCreation {
    private LinkedList<Integer> adjacency[];
    public graphCreation(int v){
        adjacency = new LinkedList[v];
        for (int i=0;i<v;i++){
            adjacency[i] =new LinkedList<Integer>();
        }
    }
    public void insertEdge(int s,int d){
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    public void bfs(int source){    //Breath First Search
        boolean[] visited_nodes = new boolean[adjacency.length];
        int[] parent_nodes = new int[adjacency.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited_nodes[source]=true;
        parent_nodes[source]=-1;
        while (!q.isEmpty()){
            int p = q.poll();
            System.out.print(p+" ");
            for (int i:adjacency[p]){
                if (!visited_nodes[i]){
                    visited_nodes[i]=true;
                    q.add(i);
                    parent_nodes[i]=p;
                }
            }
        }
    }

    public void dfs(int source){    //Depth First Search
        boolean[] visited_nodes = new boolean[adjacency.length];
        int[] parent_nodes = new int[adjacency.length];
        Stack<Integer> s = new Stack<>();
        s.add(source);
        visited_nodes[source]=true;
        parent_nodes[source]=-1;
        while (!s.isEmpty()){
            int p = s.pop();
            System.out.print(p+" ");
            for (int i:adjacency[p]){
                if (!visited_nodes[i]){
                    visited_nodes[i]=true;
                    s.add(i);
                    parent_nodes[i]=p;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter no. of Edges: ");
        int e = sc.nextInt();
        graphCreation g = new graphCreation(v);
        for (int i=0;i<e;i++){
            System.out.println("Enter "+i+"th Edge Element's: ");
            int s =sc.nextInt();
            int d = sc.nextInt();
            g.insertEdge(s,d);
        }
        System.out.print("Enter Source For Traverse the Graph: ");
        int source = sc.nextInt();
        System.out.print("bfs is: ");
        g.bfs(source);
        System.out.println();
        System.out.print("dfs is: ");
        g.dfs(source);

    }
}
