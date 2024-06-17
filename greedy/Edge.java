package greedy;

public class Edge implements Comparable<Edge> {

    int weight;
    int src;
    int dest;
   
    public Edge( int src, int weight,int dest) {
        this.src = src;
        this.weight = weight;
        this.dest = dest;
    }



    public int compareTo(Edge o) {
        return this.weight - o.weight;
        
    }

    
    
}
