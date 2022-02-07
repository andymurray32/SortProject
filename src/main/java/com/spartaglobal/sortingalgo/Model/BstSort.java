package com.spartaglobal.sortingalgo.Model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class BstSort implements Method {
    static ArrayList<Integer> a = new ArrayList<>();
    // Root of BST
    static Node root;
    private static final Logger logger = LogManager.getLogger("BST logger:");

    // Constructor
    public BstSort() {
        root = null; // originally empty
    }

    // This method mainly calls InorderRec()
    public static void order() {
        recursiveOrder(root);
    }

    // traversal of BST in order of smallest to highest
    public static void recursiveOrder(Node root) {
        if (root != null) {
            recursiveOrder(root.left);
            a.add(root.key); // add the order to arraylist
            recursiveOrder(root.right);
        }
    }

    //adds array to tree and get the correct order from it
    public static void ArrToTreeToArr(int[] array) {
        BstSort tree = new BstSort();
        for (int i = 0; i < array.length; i++) {
            tree.insert(array[i]);
        }
        // print inorder traversal of the BST
        order();
        for (int i = 0; i < array.length; i++) {
            array[i] = a.get(i); //changing the values of array with the ones from the BST
        }
    }

    // recursively call insert function to put the new key into BST
    // Insert next val from array into BST
    void insert(int key) {
        root = recursiveInsert(root, key);
    }

    Node recursiveInsert(Node root, int key) {

        //new node if tree empty
        if (root == null) {
            root = new Node(key); //root will be first value in array
            return root;
        }

        //using recursion, add compare values and add to tree
        if (key < root.key)
            root.left = recursiveInsert(root.left, key);
        else if (key > root.key)
            root.right = recursiveInsert(root.right, key);
            //if its the same will add to the left
        else if (key == root.key)
            root.left = recursiveInsert(root.left, key);
        return root;
    }

    @Override
    public void sort(int[] array) {
        ArrToTreeToArr(array);
        logger.info("Sort is complete!");
    }

    // Nested class to contain the child of the Node and values
    class Node {
        int key; //the value from array
        Node left, right; // left smaller, right bigger

        public Node(int k) {
            key = k;
            left = right = null;
        }
    }
}
