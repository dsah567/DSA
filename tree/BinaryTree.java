package tree;

class Node{
    Node leftNode;
    int data;
    Node rightNode;
    
    public Node(int data){
        this.leftNode=null;
        this.data = data;
        this.rightNode = null;
    }

}
public class BinaryTree {

    Node root;

    public BinaryTree(){
        this.root = null;
    }

    public void add(int data){
        this.root = addRecursive(root,data);
    }

    public Node addRecursive(Node current,int data){
        if (current == null){
            return new Node(data);
        }

        if(data> current.data){
            current.rightNode =addRecursive(current.rightNode, data);
        }
        else if(data<current.data){
            current.leftNode =addRecursive(current.leftNode, data);
        }

        
        return current;
    }

    public void search(int data){
        if(this.root != null ){
            searchRec(this.root, data);
            return;
        }

        System.out.println("Tree is empty");
        
    }

    public void searchRec(Node current,int data){
        if(current != null){

            if(data == current.data){
                System.out.println("data found");
            }
            else if(data< current.data){
                searchRec(current.leftNode, data);;
            }
            else{
                searchRec(current.rightNode, data);
            }
            return;
        }
        System.out.println("Data Not Found");

    }

    public void inOrderTraverser(){
        if(this.root != null){
            inOrderTraverserRecursive(this.root);
        }
        else{
            System.out.println("tree is empty");
        }
    }

    public void inOrderTraverserRecursive(Node current){

        if(current!= null){

            inOrderTraverserRecursive(current.leftNode);
            System.out.println(" " + current.data + "");
            inOrderTraverserRecursive(current.rightNode);
        }

    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
        tree.inOrderTraverser();
        tree.search(5);
        tree.search(7);
        tree.search(11);
    }


    
}