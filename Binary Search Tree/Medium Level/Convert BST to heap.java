QUESTION LINK - https://practice.geeksforgeeks.org/problems/bst-to-max-heap/1
VIDEO LINK - https://www.youtube.com/watch?v=v-wHMuB8Wdw

========================================================ANSWER=====================================================================================
  
class Solution
{
    static Stack<Integer> st = new Stack<>();
    public static void convertToMaxHeapUtil(Node root)
    {

        //st = new Stack<>();
        
        inorder(root);
        postorder(root);
        
        
    }
    
     static void inorder(Node root){
        
        if(root == null) return;
        
        inorder(root.left);
        st.push(root.data);
        inorder(root.right);
    }
    
     static void postorder(Node root){
        
        if(root == null) return;
        
        root.data = st.pop();
        postorder(root.right);
        postorder(root.left);
        
        
        
    }
    
    
    
}
