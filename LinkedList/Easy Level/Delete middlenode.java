QUESTION LINK - https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1

========================================================ANSWER=====================================================================================
class Solution {
    Node deleteMid(Node head) {
        
        if(head == null) return null;
        if(head.next==null) return null;
        
        Node mid = findMid(head);
        Node temp = head;
       
        while(temp.next!= mid){
            
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
        
        
    }
    
    Node findMid(Node head){
        
       
        
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}
