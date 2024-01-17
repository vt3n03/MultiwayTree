public class Main {
    public static void main(String[] args) {
        // Create a new MWayTree with order 4
        MWayTree tree = new MWayTree(4);

        // Insert keys into the B-tree
        tree.insert(50);
        tree.insert(60);
        tree.insert(80);
        tree.insert(30);
        tree.insert(35);
        tree.insert(58);
        tree.insert(59);
        tree.insert(63);
        tree.insert(70);
        tree.insert(73);
        tree.insert(100);
        tree.insert(52);
        tree.insert(54);
        tree.insert(61);
        tree.insert(62);
        tree.insert(57);
        tree.insert(55);
        tree.insert(56);

        // Print the B-tree before inserting key 71
        tree.print();
        System.out.println("Inserting 71");
        // Insert key 71 into the B-tree
        tree.insert(71);
        // Print the B-tree after inserting key 71
        tree.print();

        System.out.println("Inserting 84");
        // Insert key 84 into the B-tree
        tree.insert(84);
        // Print the B-tree after inserting key 84
        tree.print();

        // Test case 1: A key is placed into a leaf that still has room.
        System.out.println("Test case 1: A key is placed into a leaf that still has room.");
        // Create a new MWayTree with order 4
        tree = new MWayTree(4);
        // Insert keys 1, 2, 3, and 4 into the B-tree
        for (int i = 1; i <= 4; i++) {
            tree.insert(i);
        }
        // Print the B-tree after inserting keys 1, 2, 3, and 4
        tree.print();
        System.out.println();

        // Test case 2: The leaf in which a key is to be placed is full.
        System.out.println("Test case 2: The leaf in which a key is to be placed is full.");
        // Create a new MWayTree with order 4
        tree = new MWayTree(4);
        // Insert keys 1 to 8 into the B-tree
        for (int i = 1; i <= 8; i++) {
            tree.insert(i);
        }
        // Print the B-tree after inserting keys 1 to 8
        tree.print();
        System.out.println();

        // Test case 3: The root of the B-tree is full.
        System.out.println("Test case 3: The root of the B-tree is full.");
        // Create a new MWayTree with order 4
        tree = new MWayTree(4);
        // Insert keys 1 to 17 into the B-tree
        for (int i = 1; i <= 17; i++) {
            tree.insert(i);
        }
        // Print the B-tree after inserting keys 1 to 17
        tree.print();
        System.out.println();
    }
}
