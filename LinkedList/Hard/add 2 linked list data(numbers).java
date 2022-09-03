QUESTION LINK - https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
its a shitty question studied from bihar guy

========================================================ANSWER=====================================================================================
class Solution{
   //Function to add two numbers represented by linked list.
   
   static Node reverseList(Node head){
       Node curr = null;
       Node next = null;
       Node prev = null;
       curr = head;
       
       while(curr.next != null){
           
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
           
       }
       
       curr.next = prev;
       
       
       return curr;
       
       
   }
  
   
   static Node addTwoLists(Node first, Node second){
       
       //Reversing the linked list
       first = Solution.reverseList(first);
       second = Solution.reverseList(second);
       
       
       //Adding the linked list numbers
       Node head = null;
       Node temp = null;
       int carry = 0;
       int sum = 0;
       
       
       while(first != null && second != null){
           sum = carry + first.data + second.data;
           
           if(sum > 9){
               carry = sum/10;
               sum = sum%10;
           }else{
               carry = 0;
           }
           
           if(head == null){
               head = new Node(sum);
               temp = head;
           }else{
               temp.next = new Node(sum);
               temp = temp.next;
           }
           sum = 0;
           first = first.next;
           second = second.next;
       }
       
       
       
       
       sum = 0;
       if(first == null){
            while(second != null){
               sum = carry + second.data;
               if(sum > 9){
                   carry = sum/10;
                   sum = sum%10;
               }else{
                   carry = 0;
               }
               
               temp.next = new Node(sum);
               temp = temp.next;
               second = second.next;
           }
       
       }
       
       if(second  == null){
           while(first != null){
               sum = carry + first.data;
               if(sum > 9){
                   carry = sum/10;
                   sum = sum%10;
               }else{
                   carry = 0;
               }
               
               temp.next = new Node(sum);
               temp = temp.next;
               first = first.next;
           }
           
       }
       
       if(first == null && second == null){
           if(carry > 0){
               temp.next = new Node(carry);
               temp = temp.next;
           }
       }
       
       
       //Again reversing the resultant linked list to get answer
       Node main = Solution.reverseList(head);
       return main;
   }
}
