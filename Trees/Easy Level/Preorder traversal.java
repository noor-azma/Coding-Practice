QUESTION LINK - https://practice.geeksforgeeks.org/problems/preorder-traversal/1

========================================================ANSWER=====================================================================================
  
class BinaryTree
{
    
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        getPreorder(root, list);
        return list;
    }
    
   static  void getPreorder(Node root, ArrayList<Integer> list){
        
        if(root == null) return;
        
        list.add(root.data);
        getPreorder(root.left, list);
        getPreorder(root.right, list);
        
    }

}

=====================DECLARING ARRAYLIST AS A GLOBAL VARIABLE WONT WORK IN THIS PROBLEM========================
