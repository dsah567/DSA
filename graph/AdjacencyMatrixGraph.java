package graph;

public class AdjacencyMatrixGraph {

    int[][] matrix ;
    int size;

    public AdjacencyMatrixGraph(int size){
        this.size=size;
        this.matrix = new int[size][size];
    }

    public void add(int source,int destation,int value){
        matrix[source][destation]=value;
        matrix[destation][source]= value;
    }

    public void display(){
        System.out.print("  ");
        for(int i = 0; i <size;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i <size;i++){
            System.out.print(i + " ");
            for(int val : this.matrix[i]){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        AdjacencyMatrixGraph gh = new AdjacencyMatrixGraph(5);
        gh.add(0, 1, 1);
        gh.add(0, 2, 1);
        gh.add(1, 2, 1);
        gh.add(2, 3, 1);
        gh.display();
    }
}