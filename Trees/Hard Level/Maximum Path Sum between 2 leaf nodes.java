QUESTION LINK - https://practice.geeksforgeeks.org/problems/maximum-path-sum/1?page=1&difficulty[]=2&sortBy=submissions
VIDEO LINK - https://www.youtube.com/watch?v=ArNyupe-XH0
SOLUTION GIVEN IN THE VIDEO IS WRONG CHECK THE GFG COMMENTS FOR ANSWER

========================================================ANSWER=====================================================================================

class Solution
{
    
    int maxPathSum(Node root)
    { 
        
        int temp = solve(root);
        if(root.left==null || root.right==null){
            return Math.max(temp,res);
        }
        
        return res;
    } 
    
    int res = Integer.MIN_VALUE;
    
    public int solve(Node root){
        
        if(root == null) return Integer.MIN_VALUE;
        
        if(root.left == null && root.right== null) return root.data;
        
        else{
            
            int l = solve(root.left);
            int r = solve(root.right);
            
            if(root.left !=null && root.right!=null) res = Math.max(l+r+root.data, res);
            
            return root.data+Math.max(l,r);
            
        
        }
        
    }
}
