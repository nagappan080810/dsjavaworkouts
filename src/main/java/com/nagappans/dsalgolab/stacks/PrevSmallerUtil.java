package com.nagappans.dsalgolab.stacks;

import java.util.ArrayList;

public class PrevSmallerUtil {

    /*****first approach starts******/
    public ArrayList<Integer> findByOptimalApproach(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> tempStack = new Stack<Node>();
        //first element by default it will be -1
        tempStack.push(new Node(arr.get(0), null));
        result.add(-1);
        for (int i=1; i<arr.size(); i++) {
            Node smallerElemNode = checkPrevSmaller(arr.get(i), tempStack);
            tempStack.push(smallerElemNode);
            int value = smallerElemNode.prevNode==null?-1:smallerElemNode.prevNode.elem;
            result.add(value);
        }
        return result;
    }

    public Node checkPrevSmaller(int curr, Stack<Node> elements) {
        Node lastNode = elements.peek();

        do {
            if (lastNode.elem < curr) {
                return new Node(curr, lastNode);
            }
            lastNode = lastNode.prevNode;
        } while(lastNode !=null);

        return new Node(curr,  null);
    }

    private static class Node{
        Integer elem;
        Node prevNode;
        public Node(Integer elem, Node prevNode) {
            this.elem = elem;
            this.prevNode = prevNode;
        }
    }
    /*****first approach ends******/

    /*****second approach starts******/
    public ArrayList<Integer> findByBruteForceApproach(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> tempStack = new Stack<Integer>();
        //first element by default it will be -1
        tempStack.push(arr.get(0));
        result.add(-1);
        //iterating for remaining elements..
        for (int i=1; i<arr.size(); i++) {
            int smallerElem = backtrackFind(arr.get(i), tempStack);
            tempStack.push(arr.get(i));
            result.add(smallerElem);
        }
        return result;
    }

    public Integer backtrackFind(int elem, Stack<Integer> prevElements) {
        Stack<Integer> backupStack = new Stack<>();
        while(!prevElements.isEmpty()) {
            int temp = prevElements.pop();
            backupStack.push(temp);
            if (temp<elem) {
                loadback(backupStack, prevElements);
                return temp;
            }
        }
        loadback(backupStack, prevElements);
        return -1;
    }

    public Stack<Integer> loadback(Stack<Integer> source, Stack<Integer> target) {
        while (!source.isEmpty()) {
            target.push(source.pop());
        }
        return target;
    }
}
