QUESTION LINK - https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
VIDEO LINK - STRIVER (FOR UNCONNECTED GRAPH)

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

================================FOR UNCONNECED GRAPH=============


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[V];
        
        for(int i=0; i<V; i++){
            
            if(visited[i] == false){
                helper(i, adj, visited, ans);
            }
        }
        
        return ans;
    }
    
    public void helper(int j, ArrayList<ArrayList<Integer>> adj, boolean visited[], ArrayList<Integer> ans){
        
        ans.add(j);
        visited[j] = true;
        
        for(Integer i : adj.get(j)){
            
            if(visited[i] == false){
                helper(i, adj, visited, ans);
            }
        }
        
    }
}
