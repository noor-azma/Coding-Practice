QUESTION LINK - https://practice.geeksforgeeks.org/problems/possible-paths-between-2-vertices-1587115620/1
VIDEO LINK - https://www.youtube.com/watch?v=DrQ-eTN2v3A&list=PL-Jc9J83PIiHfqDcLZMcO9SsUDY4S3a-v&index=5

========================================================ANSWER=====================================================================================
  

class Solution {
    int count =0;
    // Function to count paths between two vertices in a directed graph.
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                   int destination) {
        boolean[] visited = new boolean[V];
        
        helper(adj, source, destination, visited);
        return count;
        
    }
    
    void helper(ArrayList<ArrayList<Integer>> adj, int source,
                   int destination, boolean[] visited){
            
            if(source == destination){
                count++;
                return;
            }
            
            visited[source] = true;
            
            for(int i :adj.get(source)){
                
                if(visited[i] == false){
                    
                    helper(adj, i, destination, visited);
                }
            }
            
            visited[source] = false;
                       
            
                       
    }
    
}
