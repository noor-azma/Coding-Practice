QUESTION LINK - https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1

========================================================ANSWER=====================================================================================
  
class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        
        int mid = 0;
        
        if(sizeOfStack%2 == 0){
            mid = (sizeOfStack/2) -1;
        }
        
        else mid = (sizeOfStack/2);
        
        s.remove(mid);
    } 
}
