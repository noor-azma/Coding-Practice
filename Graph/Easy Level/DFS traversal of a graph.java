QUESTION LINK - https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

========================================================ANSWER=====================================================================================
  
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
       ArrayList<Integer> ans = new ArrayList<>();
       
       helper(adj, ans, 0);
       
       return ans;
       
    }
    
    public ArrayList<Integer> helper(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer>ans, int source){
        
        ans.add(source);
        
        for(Integer a : adj.get(source)){
            
            if(!ans.contains(a)){
                helper(adj, ans, a);
            }
        }
        return ans;
    }
}
