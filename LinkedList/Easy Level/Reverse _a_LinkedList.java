QUESTION LINK - https://leetcode.com/problems/reverse-linked-list/

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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp = head.next;
        
        ListNode ansHead = reverseList(head.next);
        
        temp.next = head;
        head.next = null;
        return ansHead;        
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
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr =  head;
        ListNode temp;
        
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
       return prev; 
    }
}
