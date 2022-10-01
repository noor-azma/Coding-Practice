QUESTION LINK - https://practice.geeksforgeeks.org/problems/rotate-doubly-linked-list-by-p-nodes/1
VIDEO LINK - https://www.youtube.com/watch?v=fUs3B2ti97M

========================================================ANSWER=====================================================================================
  

class Solution{
	public Node rotateDLL(Node start, int p) {
	    if(p==0) return start;
	    
	    int count = 1;
	    Node temp = start;
	    
	    while(count<p && temp!=null) {
	        temp = temp.next;
	        count++;
	    }
	    
	    Node Nth = temp;
	    
	    while(temp.next != null) temp = temp.next;
	    
	    temp.next = start;
	    start.prev = temp;
	    
	    start = Nth.next;
	    start.prev = null;
	    Nth.next = null;
	    
	    return start;
	    
	    
	}
}
