class MWayTree {
    Node root; // The root node of the M-way tree
    int m; // The order of the M-way tree

    MWayTree(int m) {
        this.m = m;
        root = new Node(m); // Initialize the M-way tree with an empty root node
    }

    // Method to insert a new key into the M-way tree
    void insert(int key) {
        if (root.isFull()) {
            // If the root is full, create a new root node and split the existing root
            Node newRoot = new Node(m);
            newRoot.children.add(root);
            splitChild(newRoot, 0, root);
            root = newRoot;
        }
        insertNonFull(root, key); // Insert the key into the non-full tree
    }

    // Method to insert a key into a non-full node of the M-way tree
    void insertNonFull(Node node, int key) {
        int i = node.keys.size() - 1;
        if (node.isLeaf()) {
            // If the node is a leaf node, find the appropriate position to insert the key
            while (i >= 0 && key < node.keys.get(i)) {
                i--;
            }
            node.keys.add(i + 1, key); // Insert the key at the correct position
        } else {
            // If the node is not a leaf, find the appropriate child node to insert the key
            while (i >= 0 && key < node.keys.get(i)) {
                i--;
            }
            i++;
            if (node.children.get(i).isFull()) {
                // If the child node is full, split it before inserting the key
                splitChild(node, i, node.children.get(i));
                if (key > node.keys.get(i)) {
                    i++;
                }
            }
            insertNonFull(node.children.get(i), key); // Recursively insert the key into the child node
        }
    }

    // Method to split a child node when it is full
    void splitChild(Node parent, int index, Node child) {
        Node newNode = new Node(m); // Create a new node to hold the split keys
        parent.keys.add(index, child.keys.remove(m / 2 - 1)); // Move the middle key to the parent node
        parent.children.add(index + 1, newNode); // Add the new node as a child of the parent
        while (child.keys.size() > m / 2 - 1) {
            // Move the remaining keys to the new node
            newNode.keys.add(child.keys.remove(m / 2 - 1));
        }
        if (!child.isLeaf()) {
            while (child.children.size() > m / 2) {
                // Move the remaining children to the new node if it's an internal node
                newNode.children.add(child.children.remove(m / 2));
            }
        }
    }

    // Method to print the keys of a node and its children in a depth-first manner
    void print(Node node) {
        System.out.println(node.keys); // Print the keys of the current node
        for (Node child : node.children) {
            print(child); // Recursively print the children of the current node
        }
    }

    // Method to print the entire M-way tree
    void print() {
        print(root); // Start printing from the root node
    }
}
