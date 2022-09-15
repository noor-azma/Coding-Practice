QUESTION LINK - https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
VIDEO LINK - https://www.youtube.com/watch?v=S0Bwgtn32uI&t=18s

========================================================ANSWER=====================================================================================
  
class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        
        if(root == null) return 0;
        
        int lDiameter = diameter(root.left);
        int rDiameter = diameter(root.right);
        int f = height(root.left) +height(root.right) +1;
        
        return Math.max(lDiameter, Math.max(rDiameter, f));
    }
    
    int height(Node root){
        
        if(root ==null) return 0;
        
        int lheight = height(root.left);
        int rheight = height(root.right);
        
        if(lheight > rheight) return lheight+1;
        else return rheight+1;
        
    }
}
