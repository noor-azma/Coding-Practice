QUESTION LINK - https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
Ask adarsh
Approach - revers then add then reverse again 

========================================================ANSWER=====================================================================================
class Solution
{
    public static Node addOne(Node head) 
    { 
        
        Node revHead = reverse(head);
        Node temp = revHead;
        
        
         if(revHead.data < 9) revHead.data += 1;
        
        else{    
           while(temp != null){
               
                if(temp.data < 9) {
                    temp.data += 1;
                    break;
                }
            
                if(temp.data == 9){
                
                    temp.data =0;
            
                }
                
                temp = temp.next;
               
           }
        }
        
        Node ans = reverse(revHead);
        
        if(ans.data ==0){
            Node extra = new Node(1);
            extra.next = ans;
            return extra;
        }
        return ans;
        
    }
    
    static Node reverse(Node head){
        
        Node curr = head ,prev =null, next = null;
        
        while(curr!= null){
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            
            curr = next;
        }
        
        return prev;
    }
}
