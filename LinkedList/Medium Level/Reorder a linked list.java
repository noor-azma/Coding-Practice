QUESTION LINK - https://practice.geeksforgeeks.org/problems/reorder-list/1?page=1&difficulty[]=2&sortBy=submissions
VIDEO LINK - https://www.youtube.com/watch?v=mD7L5l2NmGU

========================================================ANSWER=====================================================================================
 //its a pretty easy code explained properly in the video. fisrt we find middle, split ll into 2 parts and then reverse the 2nd ll and merge them both
class gfg {
    Node reorderlist(Node head) {
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast!=null && fast.next!= null){
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        Node second = reverse(slow.next);
        slow.next = null;
        Node first = head;
        
        while(second!=null){
            
            Node temp1 = first.next;
            Node temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
            
        }
        
        return head;
    }
    
    Node reverse(Node head){
        
        Node prev = null, current = head, next = null;
        
        while(current != null){
            
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;

        }
        return prev;
    }
    

}
