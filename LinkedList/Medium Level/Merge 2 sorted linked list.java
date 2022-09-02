QUESTION LINK - https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1

========================================================ANSWER=====================================================================================
class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     
     if(head1 == null) return head2;
     if(head2 == null) return head1;
     
     Node t1 = head1, t2 = head2, head = null , tail = null;
     
     if(t1.data <= t2.data){
         head = t1;
         tail = t1;
         t1 = t1.next;
         
     }
     
      else{
         head = t2;
         tail = t2;
         t2 = t2.next;
         
     }
     
     while(t1 != null && t2!= null){
         
         if(t1.data <= t2.data){
             tail.next = t1;
             tail = t1;
             t1 = t1.next;

         }
         
         else{
             
             tail.next = t2;
             tail = t2;
             t2 = t2.next;
             
         }
         
     }
     
     if(t1!= null){
         tail.next = t1;
     }
     
     if(t2!=null){
           tail.next=t2;
       }
        return head;
     
     
   } 
}
