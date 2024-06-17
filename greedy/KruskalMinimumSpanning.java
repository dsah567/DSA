package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalMinimumSpanning {

    private int V;
    private List<Edge> ed;

    public KruskalMinimumSpanning(int v) {
        V = v;
        this.ed =new ArrayList<>();
    }

    public void addEdge (int src,int weight,int dest){
        ed.add(new Edge( src, weight,dest));
    }
    public void display (List<Edge> edges){
        for (Edge l: edges){
            System.out.println(l.src+ " " +l.weight+ " " +l.dest);

        }
    } 


    public List<Edge> findMST() {
        Collections.sort(ed);

        DisjointSet ds = new DisjointSet(V);
        List<Edge> mst = new ArrayList<Edge>();

        for(Edge edge : ed){
            int root1= ds.find(edge.src);
            int root2= ds.find(edge.dest);

            if(root1 != root2){
                mst.add(edge);
                ds.union(root1, root2);
            }
        }
       
        return mst;
    }

    public static void main(String[] args) {

        KruskalMinimumSpanning graph = new KruskalMinimumSpanning(4);

        graph.addEdge(1, 15, 3);
        graph.addEdge(0, 5, 3);
        graph.addEdge(0, 6, 2);
        graph.addEdge(0, 10, 1);
        graph.addEdge(2, 4, 3);

        List<Edge> mst = graph.findMST();

        System.out.println("Edges in the Minimum Spanning Tree:");
        // graph.display(mst);
        for (Edge l: mst){
            System.out.println(l.src+ " " +l.weight+ " " +l.dest);

        }
        
    }

    
}
