//Name: Garrett Radtke
//Date: 12/1/2025

public class Node {
    int value;
    Node left;
    Node right; 

    //constructor method
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    //helper method to set right
    public void setRight(Node node) {
        this.right = node;
    }

    //helper method to set left
    public void setLeft(Node node) {
        this.left = node;
    }
}
