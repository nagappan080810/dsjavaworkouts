package com.nagappans.dsalgolab.linkedlist;

public class SegregateOldEvenNodes {
    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    ListNode head;

    public ListNode createList(int arr[]) {
        ListNode lastNode = null;
        for (int i=0; i<arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            if (i==0) {
                lastNode = head = node;
            } else {
                lastNode.next = node;
                lastNode = node;
            }
        }
        return head;
    }

    public void printList() {
        ListNode temp = head;
        while (temp!=null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }


    public void segregate() {
        ListNode odd=null, even=null, curr=head, lasteven = null, oddhead=null;
        int pos = 1, evenJump = 0;

        while (curr != null) {

            if (pos%2==1) {
                if (even!=null) {
                    odd.next = curr;
                    lasteven.next = curr.next;
                    curr.next = even;
                    odd = curr;
                    curr = even;
                    int iter = evenJump;
                    while(iter-->0) {
                        curr = curr.next;
                    }
                } else {
                    odd = curr;
                }

            } else {
                if (even == null){
                    even = curr;
                } else {

                    evenJump++;
                }
                lasteven = curr;
            }

            curr = curr.next;
            pos++;
        }
    }
}
