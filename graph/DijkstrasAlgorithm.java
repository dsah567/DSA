package graph;

import java.util.HashMap;
import java.util.Map;

public class DijkstrasAlgorithm extends AdjacencyMatrixGraph {

    Map<Integer,Integer> spt;
    boolean[] sptStatus;
    int[] dist;

    
    public DijkstrasAlgorithm(int size) {
        super(size);
        this.spt=new HashMap<>();
        sptStatus=new boolean[super.size];
        dist=new int[super.size];

        for(int i=1;i<super.size;i++ ){
            dist[i]=9999;
        }
        
    }

    public int minDistIndex(){

        int minDist=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<super.size;i++){
            if(sptStatus[i]==false && dist[i]<minDist){
                minDist=dist[i];
                index=i;
            }
        }
        return index;
    }

    public void shortestDistance(){
        
        int u = minDistIndex();

        while (u > -1) {
            sptStatus[u] = true;

            for(int v = 0;v<super.size;v++){

                if(sptStatus[v]==false  && super.matrix[u][v] != 0 && dist[v]>super.matrix[u][v]+dist[u]){
                    dist[v]=dist[u]+super.matrix[u][v];
                }

            }

            u=minDistIndex();

        }


        System.out.println("Distance from source to vertex");
        for(int n :dist){
            System.out.println(n);
        }
        
    }

    public static void main(String[] args) {


        DijkstrasAlgorithm dj = new DijkstrasAlgorithm(9);
        dj.matrix= new int[][]{ { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        dj.display();
        dj.shortestDistance();

        // DijkstrasAlgorithm dj = new DijkstrasAlgorithm(5);
        // dj.add(0, 1, 4);
        // dj.add(0, 2, 1);
        // dj.add(2, 1, 2);
        // dj.add(2, 3, 5);
        // dj.add(1, 3, 1);
        // dj.add(3, 4, 3);

        //dj.display();
        //dj.shortestDistance();

        
    }
}