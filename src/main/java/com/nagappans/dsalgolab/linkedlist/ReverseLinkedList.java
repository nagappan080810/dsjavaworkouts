package com.nagappans.dsalgolab.linkedlist;

public class ReverseLinkedList {
    public void reverseByRecursion(LinkedList<Integer> list) {
        reverseRecursively(list.getHead(), list);

    }

    private LinkedList.ListNode<Integer>  reverseRecursively(LinkedList.ListNode<Integer> node,
                                                             LinkedList<Integer> list) {
        LinkedList.ListNode<Integer> currentNode = node;
        if (node.next != null) {
            LinkedList.ListNode<Integer> nextNode = reverseRecursively(node.next, list);
            nextNode.next = currentNode;
            currentNode.next = null;
            return currentNode;
        } else {
            list.setHead(node);
            return node;
        }

    }

    public boolean isPalindrome(LinkedList.ListNode<Integer> headNode) {
        return checkRecursivelyByMatch(headNode, headNode).next == null ? true : false;
    }

    private LinkedList.ListNode<Integer> checkRecursivelyByMatch(LinkedList.ListNode<Integer> head,
                                           LinkedList.ListNode<Integer> node) {
        if (node==null) return head;

        LinkedList.ListNode<Integer> result = checkRecursivelyByMatch(head, node.next);

        if (result !=null && result.next != null && result.getElem() == node.getElem())
            return result.next;
        else
            return result;
    }
}
