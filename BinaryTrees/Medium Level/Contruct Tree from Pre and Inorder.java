QUESTION LINK - https://practice.geeksforgeeks.org/problems/construct-tree-1/1 

========================================================ANSWER=====================================================================================
  
class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        int inE = inorder.length - 1;
        int preE = preorder.length - 1;
        
        return makeTree(inorder, preorder , 0 , inE, 0, preE);
    }
    
    
    public static Node makeTree(int[] inorder, int preorder[], int inS, int inE, int preS, int preE){
        
        int rootIndex = -1;
        
        if(inS > inE) return null;
        
        Node root = new Node(preorder[preS]);
        
        for(int i = inS; i<=inE; i++){
            if(inorder[i] == preorder[preS]){
                rootIndex = i;
                break;
            }
        }
        
        int leftInS = inS;
        int leftInE =rootIndex -1;
        int rightInS = rootIndex+1;
        int rightInE = inE;
        
        int leftPreS = preS+1;
        int leftPreE = leftPreS + (leftInE - leftInS);
        int rightPreS =  leftPreE + 1; 
        int rightPreE = preE;
        
        root.left = makeTree(inorder, preorder, leftInS , leftInE , leftPreS, leftPreE);
        root.right = makeTree(inorder, preorder, rightInS , rightInE , rightPreS, rightPreE);
        
        return root;
        
    }
}
