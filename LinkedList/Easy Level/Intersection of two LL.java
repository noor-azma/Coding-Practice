QUESTION LINK - https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
VIDEO LINK - Ask Yo guy

========================================================ANSWER=====================================================================================
  
class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        
        Node temp1 = head1;
        Node temp2 = head2;
        
        Node newHead = null;
        Node curr = null; // to iterate thru the new LL
        
        while(temp1!=null && temp2 != null){
            
            if(temp1.data == temp2.data){
                
                // if its first node of intersection
                if(newHead == null){
                    
                    Node temp =  new Node(temp1.data);
                    newHead = temp;
                    curr = newHead;
                }
                
                //if not the first
                else{
                    
                    Node temp = new Node(temp1.data);
                    curr.next = temp;
                    curr = curr.next;
                }
                
                
                //now iterate in both LL
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            
            else if(temp1.data < temp2.data){
                temp1 = temp1.next;
            }
            
            else temp2 = temp2.next;
            
        }
        return newHead;
    }
}
