package com.nagappans.dsalgolab.trees;

import java.util.*;

class BinaryTreeIterativeTraversal {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; left=right=null;}
     }

     TreeNode root;

     public BinaryTreeIterativeTraversal(int arr[]) {

         int level = 0;
         Queue<TreeNode> queue= new ArrayDeque<>();
         root = new TreeNode(arr[0]);
         queue.add(root);
         for (int i=1; i <arr.length; i++) {
            TreeNode treeNode = new TreeNode(arr[i]);
            queue.add(treeNode);
            TreeNode parentNode = queue.peek();
            if (parentNode.left == null) {
                parentNode.left = treeNode;
            } else if (parentNode.right ==null) {
                parentNode.right = treeNode;
                queue.poll();
            }
         }

     }

     //print pre order traversal..MLR
     public List<Integer> preorderIterative() {
         List<Integer> result = new ArrayList<>();
         Stack<TreeNode> buffer = new Stack<>();
         if (root!=null) {
             buffer.push(root);
         }
         while(!buffer.isEmpty()) {
             TreeNode curr = buffer.pop();
             result.add(curr.val);
             if (curr.right!=null) {
                 buffer.push(curr.right);
             }
             if (curr.left!=null) {
                 buffer.push(curr.left);
             }
         }
         return result;
     }


     //print in order traversal LMR
     public List<Integer> inorderIterative() {
         List<Integer> result = new ArrayList<>();
         Stack<TreeNode> buffer = new Stack<>();
         TreeNode curr = root;
         while(true) {
             while (curr.left!=null) {
                 buffer.push(curr);
                 curr = curr.left;
             }

            buffer.push(curr);
             curr = null;
             while(!buffer.isEmpty()) {
                 TreeNode test = buffer.pop();
                 result.add(test.val);
                 if (test.right!=null ) {
                     curr = test.right;
                     break;
                 }
             }
             if (curr==null && buffer.isEmpty()) break;
         }
         return result;
     }

     public List<Integer> postOrderIterative() {
         List<Integer> result = new ArrayList<>();
         Stack<TreeNode> buffer = new Stack<>();
         TreeNode curr = root;
         while(true) {
             //go deep dive in right side
             while(curr.right!=null) {
                 buffer.push(curr);
                 curr = curr.right;
             }
             buffer.push(curr);
             curr = null;
             //extract the nodes till empty or if it has left node..
             while(!buffer.isEmpty()) {
                 TreeNode poppedNode = buffer.pop();
                 result.add(poppedNode.val);
                 if (poppedNode.left!=null) {
                     curr = poppedNode.left;
                     break;
                 }
             }
             if (curr==null) break;
         }

         return result;
     }

}
