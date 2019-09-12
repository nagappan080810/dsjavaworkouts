package com.nagappans.dsalgolab.trees;
import java.util.*;

public class MaximalRectangle {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null; this.right = null;
        }
    }

    TreeNode root;
    HashMap<Integer, List<Integer>> maximalRectangle = new HashMap<>();
    public MaximalRectangle(int arr[]) {
        root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        for (int i=1; i< arr.length; i=i+2) {
            TreeNode parent = queue.poll();
            TreeNode leftChild = new TreeNode(arr[i]);
            TreeNode rightChild = new TreeNode(arr[i+1]);
            parent.left = leftChild;
            parent.right = rightChild;
            queue.add(leftChild);
            queue.add(rightChild);
        }
    }

    public void inOrderTraversal() {
        extractRectangleValues(root, 0);
    }

    public void extractRectangleValues(TreeNode root, int level) {
        if (root ==null ) return;
        if (maximalRectangle.get(level)==null) {
            List<Integer> elements = new ArrayList<>();
            elements.add(root.data);
            maximalRectangle.put(level, elements);
        } else {
            maximalRectangle.get(level).add(root.data);
        }
        extractRectangleValues(root.left, level-1);
        extractRectangleValues(root.right, level+1);
    }

    public HashMap<Integer, List<Integer>> getMaximalRectangle() {
        return this.maximalRectangle;
    }
}
