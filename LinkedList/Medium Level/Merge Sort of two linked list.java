QUESTION LINK - https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1

========================================================ANSWER=====================================================================================
  
========================================================CODING NINJA SOLUTION (CORRECT ANSWER BUT SHOWS STACK OVERFLOW)=============================
class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        
        if(head == null) return head;
        if(head.next == null) return head;
        
        Node middle = midpoint(head);
        
        Node head1 = head, head2 = middle.next;
        
        middle.next = null;
        
        head1 = mergeSort(head1);
        head2 = mergeSort(head2);
        Node res = merge(head1 , head2);
        
        return res;
        
    }
    
    static Node midpoint(Node head){
        
        Node fast = head.next;
        Node slow = head;
        
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        return slow;
    }
    
    static Node merge(Node head1, Node head2){
        
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        
        Node t1 = head1, t2 = head2, head = null, tail = null;
        
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
        
        while(t1 != null && t2 != null){
            
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
        
        if(t1 != null){
            tail.next = t1;
        }
        
        if(t2 != null){
            tail.next = t2;
        }
        
      return head; 
    }
    
    
}


========================================================OPTIMIZED SOLUTION FOUND IN COMMENTS WCH I DID NOT SOLVE====================================================
class Solution
{
   public static Node findMid(Node head){
       Node slow=head;
       Node fast=head.next;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           
       }
       return slow;
       
   }
   public static Node merge(Node left,Node right){
       Node newNode=new Node(-1);
       Node temp=newNode;
       while(left!=null && right!=null){
         if(left.data<right.data){
           temp.next=left;
           temp=left;
           left=left.next;
       } else{
            temp.next=right;
           temp=right;
           right=right.next;
       }  
       }
       while(left!=null){
           temp.next=left;
           temp=left;
           left=left.next;
       }
       while(right!=null){
          temp.next=right;
           temp=right;
           right=right.next;  
       }
       newNode=newNode.next;
       return newNode;
      
       
   }
   //Function to sort the given linked list using Merge Sort.
   static Node mergeSort(Node head)
   {
       if(head==null || head.next==null){
           return head;
       }
       Node mid=findMid( head);
       Node left=head;
       Node right=mid.next;
       mid.next=null;
       left=mergeSort(left);
       right=mergeSort(right);
       Node res=merge(left,right);
       return res;
       
       
   }
}


