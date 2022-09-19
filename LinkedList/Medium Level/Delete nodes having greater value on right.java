QUESTION LINK - https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1
VIDEO LINK - dry run

========================================================ANSWER=====================================================================================
  
class Solution
{
    Node compute(Node head)
    {
        Node yo = reverse(head);
        
        Node nHead = new Node(0);
        Node nTail = nHead;
        
        int max = Integer.MIN_VALUE;
        
        Node temp = yo;
        
        while(temp != null){
            if(temp.data>=max){
                max = temp.data;
                Node newNode = new Node(max);
                nTail.next = newNode;
                nTail = newNode;
            }
            
            temp = temp.next;
        }
        
        nHead = reverse(nHead.next);
        return nHead;
        
    }
    
    Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node temp = null;
        
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}
