QUESTION LINK - https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1

========================================================ANSWER=====================================================================================
  
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> hs = new HashSet<>();
        Node curr = head;
        while(curr.next != null){
            hs.add(curr.data);
            
            if(hs.contains(curr.next.data)){
                curr.next = curr.next.next;
            }
            
            else{
                
                curr = curr.next;
            }
        }
        
        return head;
    }
}
