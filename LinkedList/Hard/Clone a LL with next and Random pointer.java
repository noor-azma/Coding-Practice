QUESTION LINK - https://practice.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1?page=1&difficulty[]=2&sortBy=submissions
VIDEO LINK - https://www.youtube.com/watch?v=4apaOcK586U&t=134s

========================================================ANSWER=====================================================================================

class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        
        Node curr = head;
        while(curr != null){
            
            Node temp = curr.next; //saving the curr.next since we will change it
            
            curr.next = new Node(curr.data); // pointting the curr node to a new node
            
            curr.next.next = temp;
            
            curr = temp;
            
        }
        
        curr = head;
        
        //Setting random pointers of new nodes
        
        while(curr != null){
            
            if(curr.next != null){
                curr.next.arb = (curr.arb != null)? curr.arb.next : null;
            }
            
            curr = curr.next.next;
        }
        
        //separating the 2 LL
        Node orig = head, copy = head.next;
        Node temp = copy; // we will return temp so we storing the head value in it
        
        while(orig != null && copy!= null){
            
            orig.next=(orig.next!=null)?orig.next.next:orig.next;
            copy.next=(copy.next!=null)?copy.next.next:copy.next;
            // orig.next = orig.next.next; these two lines wont work u will get a null pointer exception
            // copy.next = copy.next.next;
            orig = orig.next;
            copy = copy.next;
        }
        
        return temp;
        
    }
}

