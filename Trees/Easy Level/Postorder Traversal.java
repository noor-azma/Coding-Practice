QUESTION LINK - https://practice.geeksforgeeks.org/problems/postorder-traversal/1

========================================================ANSWER=====================================================================================
class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       ArrayList<Integer> list = new ArrayList<>();
       
       getPostorder(root, list);
       
       return list;
    }
    
    void getPostorder(Node root, ArrayList<Integer> list){
        
        if(root ==  null) return;
        
        getPostorder(root.left, list);
        getPostorder(root.right, list);
        list.add(root.data);
    }
}
