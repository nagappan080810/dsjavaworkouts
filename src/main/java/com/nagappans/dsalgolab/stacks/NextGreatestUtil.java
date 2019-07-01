package com.nagappans.dsalgolab.stacks;

public class NextGreatestUtil {

    public int[] findNextGreatestElementsArray(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Node> nextGreaterStack = new Stack<>();
        nextGreaterStack.push(new Node(arr[arr.length-1], null));
        result[arr.length-1] = -1;
        for (int i=arr.length-2; i>=0 ; i--) {
            Node nextNode = nextGreaterStack.peek();
            while(nextNode !=null) {
                if (arr[i] < nextNode.elem) {
                    break;
                }
                nextNode = nextNode.prevNode;
            }
            nextGreaterStack.push(new Node(arr[i], nextNode));
            result[i] = (nextNode == null) ? - 1 : nextNode.elem;
        }
        return result;
    }

    private static class Node {
        int elem;
        Node prevNode;
        Node(int elem, Node prevNode) {
            this.elem = elem;
            this.prevNode = prevNode;
        }
    }


        /**
         * Next Greater element on the right
         *
         * @param arr
         *            input array
         */
        /*public static void nextElement(int[] arr) {
            Stack<Integer> stacks = new Stack<>();
            stacks.push(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                while (!stacks.isEmpty() && arr[i] > stacks.peek()) {
                    System.out.println(stacks.pop() + " --> " + arr[i]);
                }
                stacks.push(arr[i]);
            }

            while (!stacks.isEmpty())
                System.out.println(stacks.pop() + " --> " + -1);

        }

        public static void main(String[] args) {
            int[] arr = { 7 ,    22 ,    4  ,     12  ,   25  ,    3  ,    9 };
            nextElement(arr);
        }*/
}
