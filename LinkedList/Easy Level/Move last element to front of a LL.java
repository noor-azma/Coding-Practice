QUESTION LINK - https://practice.geeksforgeeks.org/problems/move-last-element-to-front-of-a-linked-list/0?category%5B%5D=Linked%20List

========================================================ANSWER=====================================================================================
  
class Solution {
    public static Node moveToFront(Node head) {
        
        if(head == null) return null;
        if(head.next == null) return head;
        
        Node curr = head;
        Node prev = null;
        
        while(curr.next != null){
            prev = curr;
            curr =  curr.next;
        }
        
        prev.next = null;
        
        curr.next = head;
        
        return curr;
        
    }
}
