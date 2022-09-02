QUESTION LINK - https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1

=========================================================================================================================================================================
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        
        if(head == null) return null;
        if(head.next == null) return head;
        Node Second = head.next; 
        Node temp = reverseList(head.next);
        
        Second.next = head;
        head.next = null;
        
        return temp;
        
    }
 }


==========================================================ITERATIVE SOLUTION============================================================================================
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        
        Node current = head;
        Node prev = null;
        Node temp;
        
        while(current != null){
            
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            
        }
       return prev; 
    }
    
    
    
}

