QUESTION LINK - https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
VIDEO LINK - Striver video

========================================================ANSWER=====================================================================================

class Solution {
   // Function to return the diameter of a Binary Tree.
   int ans=0;
   int diameters(Node root) {
       // Your code here
       if(root==null) return 0;
 
       int l = diameters(root.left);
       int r = diameters(root.right);
       
       ans = Math.max(ans,l+r+1);
       return 1+Math.max(l,r); 
   }
   
   int diameter(Node root) {
       // Your code here
       diameters(root);
       
       return ans; 
   }
}
