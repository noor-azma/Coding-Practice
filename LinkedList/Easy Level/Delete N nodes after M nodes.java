QUESTION LINK - https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1

========================================================ANSWER=====================================================================================

  static void linkdelete(Node head, int M, int N)
    {
        Node temp1=head;
        while(temp1!=null){
            int p=M;
            while(temp1!=null && p!=1){
                temp1=temp1.next;
                p--;
            }
            if(temp1==null){break;}
            p=N;
            Node temp2=temp1.next;
            while(temp2!=null && p!=0){
                temp2=temp2.next;
                p--;
            }
            temp1.next=temp2;
            temp1=temp2;
        }
    }
}

======================================================CNJ SOLUTION IF RETURN TYPE IS A NODE==================================================================
class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        
        Node temp = head, Mtail = head, Ntail = head, finalHead = head;
        
        base cases
        if(head== null) return null;
        if(M == 0) return null;
        if(N == 0) return head;
        
        while(head != null){
            
            Mtail = head;
            
            for(int i=1; i<M && Mtail!= null; i++){
                Mtail = Mtail.next;
            }
            
            if(Mtail != null){
                Ntail = Mtail.next;
            }
            
            for(int i=1; i<=N && Ntail!= null; i++){
                Ntail = Ntail.next;
            }
            
            if(Mtail != null){
                Mtail = Ntail.next;
            }
            
            head = Ntail;
            
        
        }
        
        
        
      return finalHead;
        
    }
}
