import java.util.ArrayList;
import java.util.List;

class Node {
    int m; // The maximum number of keys this node can hold (order of the M-way tree)
    List<Integer> keys; // List to store keys in the node
    List<Node> children; // List to store child nodes of the current node

    Node(int m) {
        this.m = m; // Initialize the order of the M-way tree for this node
        this.keys = new ArrayList<>(); // Initialize an empty list to store keys
        this.children = new ArrayList<>(); // Initialize an empty list to store child nodes
    }

    // Method to check if the node is a leaf node (has no children)
    boolean isLeaf() {
        return children.isEmpty();
    }

    // Method to check if the node is full (has the maximum allowed keys)
    boolean isFull() {
        return keys.size() == m - 1;
    }
}
