//Name: Garrett Radtke
//Date: 12/1/2025

public class BST {
    Node root;

    // constructor method
    public BST() {
        this.root = null;
    }

    // adds a node to the tree
    public void insert(int data) {
        if (this.root == null) {
            this.root = new Node(data);
            return;
        }
        this.root = insertHelper(this.root, data);
    }

    // recursive helper
    private Node insertHelper(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.value) { // if the data is below the current value, go left
            node.left = insertHelper(node.left, data);
        } else if (data > node.value) { // if above, go right
            node.right = insertHelper(node.right, data);
        }
        return node;

    }

    // removes a node from the tree
    public void remove(int value) {
        root = removeHelper(root, value);
    }

    // recursive helper
    private Node removeHelper(Node node, int target) {
        if (node == null) {
            return null;
        }
        if (node.value == target) {
            if (node.left == null && node.right == null) { // if node is a leaf, trim
                return null;
            } else if (node.left == null) { // return next smallest value
                return node.right;
            } else if (node.right == null) { // same as above
                return node.left;
            } else {
                Node successor = node.right;
                while (successor.left != null) { // if has two child nodes, replace current node with next smallest in
                                                 // the tree
                    successor = successor.left;
                }
                node.value = successor.value;
                node.right = removeHelper(node.right, successor.value); // trim the value that replaced the node to be
                                                                        // trimed
            }
        }
        if (target < node.value) { // recurse left
            removeHelper(node.left, target);
            return node;
        } else if (target > node.value) { // recurse right
            removeHelper(node.right, target);
        }
        return node;
    }

    // displays the tree from smallest to largest
    public void displayOrdered() {
        displayOrderHelper(root);
        System.out.println();
    }

    // recursive helper
    private void displayOrderHelper(Node node) {
        if (node == null) {
            return;
        }
        displayOrderHelper(node.left);
        System.out.print(node.value + ", ");
        displayOrderHelper(node.right);
    }

    // searches tree for node with a value
    public void search(int value) {
        boolean found = searchHelper(root, value);

        if (!found) {
            System.out.println("Node with value " + value + " was not found.");
        }
    }

    // recursive 
    private boolean searchHelper(Node node, int target) {
        if (node == null) {
            return false;
        }

        if (node.value == target) { //when node value is target 
            int children = 0;
            if (node.right != null) {
                children++;
            }
            if (node.left != null) {
                children++;
            }
            System.out.println("Node found with value " + target + ". " + "Has " + children + " child nodes.");
            return true; 
        }

        if (target < node.value) { // Recurse left and return the result of that search
            return searchHelper(node.left, target);
        } else { // Recurse right and return the result of that search
            return searchHelper(node.right, target);
        }
    }
}
