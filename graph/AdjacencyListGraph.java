package graph;

import java.util.LinkedList;
import java.util.List;

public class AdjacencyListGraph {

    int vertices;
    List<List<Integer>> alg;

    public AdjacencyListGraph(int noOfVertices){
        this.vertices = noOfVertices;
        this.alg = new LinkedList<>();
        for (int i = 0; i< vertices; i++){
            this.alg.add(new LinkedList<>());
        }
    }

    public void add(int source, int destination){
        this.alg.get(source).add(destination);
        this.alg.get(destination).add(source);
    }

    public void display(){
        for(int i =  0;i<this.vertices;i++){
            System.out.print("Vertex " + i + ":");
            for(int value:this.alg.get(i)){
                System.out.print("- > " + value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyListGraph gh = new AdjacencyListGraph(5);
        gh.add(0, 1);
        gh.add(0, 2);
        gh.add(1, 2);
        gh.add(2, 3);
        gh.display();
    }
    
}
