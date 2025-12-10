# MultiwayTree

This project implements a general M-Way Search Tree in Java.
An M-Way tree is a search tree where each node can contain multiple keys and multiple children, making it a flexible structure for ordered data storage and efficient lookup.

The project includes the full tree implementation, node structure, basic operations, and a Main program demonstrating how the tree works.

# Overview
An M-Way Search Tree generalizes binary search trees by allowing each node to store up to M−1 keys and up to M children. Keys inside a node are kept in sorted order, and child pointers partition key ranges.

This tree supports:

- Inserting keys

- Searching for keys

- Traversing the structure

- Handling node splitting through recursive structure

The program uses ```Node.java``` to represent individual nodes and ```MWayTree.java``` to manage the full data structure.

# Features
- General M-Way search tree implementation

- Sorted key insertion

- Linear search within each node

- Tree traversal methods

- Clear object oriented design

- Easy entry point through the ```Main``` class

# File Summary
```MWayTree.java```

Contains the full M-Way tree implementation:

- Stores the root node and maximum branching factor

- Supports insertion of keys

- Searches through the tree recursively

- Handles node creation and updates

- Provides traversal helpers

```Node.java```
Represents a single node in the M-Way tree:

- Stores an array of keys

- Stores an array of child pointers

- Tracks number of keys in the node

- Provides helpers for inserting and shifting keys

- Manages linkage to children

```Main.java```

Entry point of the program.
Demonstrates:

- Creating an MWayTree

- Inserting values

- Printing or traversing the tree

- Running the structure on sample input

# Example Usage
``` java
MWayTree tree = new MWayTree(4); // M = 4 (3 keys max per node)

tree.insert(8);
tree.insert(3);
tree.insert(10);
tree.insert(1);

tree.search(10); // returns true
tree.search(5);  // returns false
```

# How the Algorithm Works
Insertion

1. Search for the correct leaf position based on key comparisons.

2. Place the new key in sorted order within the node.

3. If the node overflows (more than M−1 keys), splitting strategies may apply depending on the version of the tree.

Search

1. Compare the target key with each key in the node.

2. If found, return true.

3. Otherwise, follow the correct child reference and continue recursively.

4. If a null child is reached, the key is not in the tree.
