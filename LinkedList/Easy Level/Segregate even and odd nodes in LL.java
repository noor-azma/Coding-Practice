QUESTION LINK - https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1

========================================================ANSWER=====================================================================================
  
class Solution{
    Node divide(int N, Node head){
        
        Node oddH = null, oddT = null, evenH = null, evenT = null;
        Node temp = head;
        
        while(temp != null){
            
            if(temp.data %2 ==0){
                if(evenH == null){
                    evenH = temp;
                    evenT = temp;
                }
                
                else{
                    
                    evenT.next = temp;
                    evenT = temp;
                }
                
            }
            
            else{
                
                if(oddH == null){
                    oddH = temp;
                    oddT = temp;
                }
                
                else{
                    
                    oddT.next = temp;
                    oddT = temp;
                }
                
            }
            
            temp = temp.next;
        }
        
        //base case
        if(oddH == null){
            return evenH;
        }
        
        if(evenH == null){
            return oddH;
        }
        
        evenT.next = oddH;
        oddT.next = null;
        
        return evenH;
    }
}
