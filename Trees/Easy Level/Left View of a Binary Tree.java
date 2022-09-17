QUESTION LINK - https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
VIDEO LINK - https://www.youtube.com/watch?v=Lcre2oZh5YM

========================================================ANSWER=====================================================================================
  
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> list = new ArrayList<>();
      
      leftSideView(list, root, 0);
      
      return list;
      
    }
    
    public void leftSideView(ArrayList<Integer> list, Node root, int level){
        
        // Base Case
        if(root == null){
            return;
        }
        
        if(list.size() == level){
            list.add(root.data);
        }
        
        leftSideView(list, root.left, level+1);
        leftSideView(list, root.right, level+1);
        
    }
}
