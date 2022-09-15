QUESTION LINK - https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1 

========================================================ANSWER=====================================================================================

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
       
       if(node == null) return 0;
       
       int lHeight = height(node.left);
       int rHeight = height(node.right);
       
       if(lHeight > rHeight) return lHeight+1;
       else return rHeight+1;
    }
}
