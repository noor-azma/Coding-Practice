QUESTION LINK - https://practice.geeksforgeeks.org/problems/deletion-and-reverse-in-linked-list/1
VIDEO LINK - dry run

========================================================ANSWER=====================================================================================
  
class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        
        
        Node temp = head;
        
        
        while(temp.next != head){
            if(temp.next.data == d) temp.next = temp.next.next;
            temp = temp.next;
        }
        
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr.next != head){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        curr.next = prev;
        prev = curr;
        head.next = prev;
        head = prev;
        
        return prev;
    }
}
