QUESTION LINK - https://practice.geeksforgeeks.org/problems/inorder-traversal/1

========================================================ANSWER=====================================================================================
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> list = new ArrayList<>();
    
    ArrayList<Integer> inOrder(Node root) {
        
        getInorder(root);
        return list;
        
    }
    
    void getInorder(Node root){
        
        if(root == null) return;
        
        getInorder(root.left);
        list.add(root.data);
        getInorder(root.right);
        
    }
}

=========================USE stack if recursion cannot be used=========================
