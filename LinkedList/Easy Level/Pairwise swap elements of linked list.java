QUESTION LINK - https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1

========================================================ANSWER=====================================================================================

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        if(head == null || head.next== null) return head;
        //swap
        Node temp = head.next;
        head.next = temp.next;
        temp.next = head;
        
        head = temp;
        head.next.next = pairwiseSwap(head.next.next);
        return head;
    }
}
