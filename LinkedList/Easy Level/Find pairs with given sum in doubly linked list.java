QUESTION LINK - https://practice.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1
VIDEO LINK - Dry Run

========================================================ANSWER=====================================================================================
  
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        
        Node first =head;
        Node second = head;
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        while(second.next !=null) second = second.next;
        
        while(first!= second && second.next!= first){
            
            ArrayList<Integer> list = new ArrayList<>();
            
            if(first.data + second.data == target){
                
                list.add(first.data);
                list.add(second.data);
                first = first.next;
                second = second.prev;
                ans.add(list);
                
            }
            else{
                
                if(first.data + second.data < target){
                
                first = first.next;
                
            }
            
            else second = second.prev;
            
            }
            
        }
        
        return ans;
        
    }
}
