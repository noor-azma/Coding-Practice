QUESTION LINK - https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1
VIDEO LINK - https://www.youtube.com/watch?v=Lcre2oZh5YM

========================================================ANSWER=====================================================================================
  

class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        getRightView(node, list, 0);
        
        return list;
        
    }
    
    void getRightView(Node root, ArrayList<Integer> list, int level){
        
        if(root== null) return;
        
        if(list.size() == level){
            list.add(root.data);
        }
        
        getRightView(root.right, list, level+1);
        getRightView(root.left, list, level+1);
        
        
    }
}
