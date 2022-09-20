QUESTION LINK - https://practice.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1
VIDEO LINK - Dry run

========================================================ANSWER=====================================================================================
  
class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        
        Node res = arr[0];
        for(int i=1; i<arr.length; i++){
            
            res = merge(res, arr[i]);
        }
        
        return res;
    }
    
    Node merge(Node h1, Node h2){
        
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        
        if(h1.data < h2.data){
            
            h1.next = merge(h1.next, h2);
            return h1;
        }
        
        else{
            h2.next = merge(h1, h2.next);
            return h2;
        }
    }
    
    
}
