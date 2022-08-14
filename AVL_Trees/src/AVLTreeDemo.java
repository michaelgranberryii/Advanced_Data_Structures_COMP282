public class AVLTreeDemo {
    public static void main(String[] args) {
        // Create an empty AVLTree object.
        AVLTree tree = new AVLTree();

        // Insert some random-looking integers into the tree.
        int[] keys = { 10, 20, 5, 22, 15, 47, 19, 3, 12, 18 };
        for (int key : keys) {
            Node node = new Node(key);
            tree.insert(node);
        }

        // Print the tree after all inserts are complete.
        System.out.println("Tree after initial insertions:");
        System.out.println(BSTPrint.treeToString(tree.getRoot()));
        System.out.println();

        // Find and remove the node with the key value 12.
        // This should cause a right rotation on node 10.
        System.out.println("Remove node 12:");
        tree.removeKey(12);
        System.out.println(BSTPrint.treeToString(tree.getRoot()));
        System.out.println();

        // Find and remove the node with the key value 20.
        // This should cause its right child to shift up into
        // the 20 node's position without any other reordering
        // required.
        System.out.println("Remove node 20:");
        tree.removeKey(20);
        System.out.println(BSTPrint.treeToString(tree.getRoot()));
        System.out.println();

        // Attempt to remove a node with key 30, a value not in the tree.
        System.out.println("Remove node 30 (should not be in tree):");
        if (!tree.removeKey(30)) {
            System.out.println("*** Key not found. Tree is not changed. ***");
        }
        System.out.println(BSTPrint.treeToString(tree.getRoot()));
    }
}
