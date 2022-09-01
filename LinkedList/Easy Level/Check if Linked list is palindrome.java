QUESTION LINK - https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
VIDEO LINK - https://www.youtube.com/watch?v=ee-DuKtRNGw

========================================================ANSWER=====================================================================================
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        
        if(head==null) return true;
        if(head.next == null) return true;
        
        Node mid = mid(head);
        Node last = reverse(mid);
        
        Node cur = head;
        
        while(last!= null){
            if(last.data != cur.data) return false;
            
            last = last.next;
            cur = cur.next;
        }
        
        return true;
    }
    
    
    public Node mid(Node head){
        
        Node slow = head;
        Node fast = head;
        
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public static Node reverse(Node mid){
        
        if(mid == null) return null;
        if(mid.next == null) return mid;
        
        Node Second = mid.next;
        
        Node temp = reverse(mid.next);
        
        Second.next = mid;
        mid.next = null;
        
        return temp;
        
    }
}

