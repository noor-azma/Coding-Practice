QUESTION LINK - https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1

========================================================ANSWER=====================================================================================
class BinaryTree
{
    static int sumBT(Node head){
        
        int sum = 0;
        Queue<Node> q = new LinkedList<>();
        
        q.add(head);
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            
            sum+= curr.data;
            
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        
        return sum;
    }
}
