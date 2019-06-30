package com.nagappans.dsalgolab;

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
            Stack<Integer> stack = new Stack<>();
            stack.push(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                while (!stack.isEmpty() && arr[i] > stack.peek()) {
                    System.out.println(stack.pop() + " --> " + arr[i]);
                }
                stack.push(arr[i]);
            }

            while (!stack.isEmpty())
                System.out.println(stack.pop() + " --> " + -1);

        }

        public static void main(String[] args) {
            int[] arr = { 7 ,    22 ,    4  ,     12  ,   25  ,    3  ,    9 };
            nextElement(arr);
        }*/
}
