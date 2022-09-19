QUESTION LINK - https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

========================================================ANSWER=====================================================================================
  
class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        
        int len = length(head);
        //base case
        if(n > len) return -1;
        
    	Node slow = head;
    	Node fast = head;
    	
        int count = 1;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        
        while(fast!= null){
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow.data;
    }
    
    //This is for base case if n is greater than the length
    
    int length(Node head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}
