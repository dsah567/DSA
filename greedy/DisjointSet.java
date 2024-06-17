package greedy;

import java.util.Arrays;

public class DisjointSet {
    private int[] parent;
    private int[] rank;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;  
            rank[i] = 0;    
        }
    }

    public int find(int i) {

        if(parent[i] != i){
            parent[i]=find(parent[i]);
        }
        return parent[i];
    }

    public void union(int x, int y) {

        int rootX=find(x);

        int rootY=find(y);
        System.out.println(rootX + " " + rootY);
        if(rootX == rootY){
            System.out.println("both are already joint set");
            return;
        }
        else{
            if(rank[rootX] >rank[rootY]){
                parent[rootY]=rootX;

            }
            else if(rank[rootX] <rank[rootY]){
                parent[rootX]=rootY;
            }
            else{
                parent[rootY]=rootX;
                rank[rootX]++;
            }
        }
        
    }

    public void printSets() {
        System.out.println("Parent Array: " + Arrays.toString(parent));
        System.out.println("Rank Array: " + Arrays.toString(rank));
    }

     public static void main(String[] args) {
        int n = 5;  
        DisjointSet ds = new DisjointSet(n);
        ds.printSets();

        ds.union(0, 2);
        ds.union(4, 2);
        ds.union(3, 1);

        ds.printSets();

        System.out.println("Representative of element 4: " + ds.find(4));
        System.out.println("Representative of element 3: " + ds.find(3));

        ds.union(1, 4);

        ds.printSets();
    }
}

