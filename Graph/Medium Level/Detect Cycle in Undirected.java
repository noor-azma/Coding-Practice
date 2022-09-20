QUESTION LINK - https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
VIDEO LINK - https://www.youtube.com/watch?v=qbQq-k75bcY

========================================================ANSWER=====================================================================================
  
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        boolean[] visited = new boolean[V];
        
        for(int i=0; i<V; i++){
            
            if(visited[i] == false){
                boolean cycle = isCycle(i, adj, visited);
                
                if(cycle) return true;
              
            }
            
        }
        
        return false;
        
    }
    
    public static boolean isCycle(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        
        Queue<Integer> q = new ArrayDeque<>();
        
        q.add(i);
        
        while(!q.isEmpty()){
            
            int frontNode = q.poll();
            
            if(visited[frontNode] == true){
                return true;
            }
            
            visited[frontNode] = true;
            
            for(Integer it : adj.get(frontNode)){
                
                if(visited[it] == false) q.add(it);
            }
        }
        
        return false;
    }
    
    
}
