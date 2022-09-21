QUESTION LINK - https://practice.geeksforgeeks.org/problems/bipartite-graph/1
VIDEO LINK - https://www.youtube.com/watch?v=ZBhZ1DXGrhA
 A GRAPH CAN BE BIPARTITE ONLY WHEN - 1. THE GRAPH IS ACYCLIC
                                      2. EVEN IF THE GRAPH IS CYCLIC IT HAS EVEN NUMBER OF VERTICES

========================================================ANSWER=====================================================================================
  

class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int visited[] = new int[V];
        Arrays.fill(visited, -1);
        
        for(int i=0; i< V; i++){
            
            if(visited[i] == -1){
                
               boolean isBipartite = bfsHelper(i, adj, visited);
               if(isBipartite == false) return false; 
                
            }
            
            
            
        }
        
        return true;
    }
    
    public boolean bfsHelper(int i, ArrayList<ArrayList<Integer>>adj, int visited[]){
        
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(i, 0));
        
        while(!q.isEmpty()){
            Pair rem = q.poll();
            
            if(visited[rem.v] != -1){
                if(visited[rem.v] != rem.l) return false;
            }
            
            else{
                visited[rem.v] = rem.l;
            }
            
            for(Integer nbr : adj.get(rem.v)){
                
                if(visited[nbr] == -1){
                    
                    q.add(new Pair(nbr, rem.l +1));
                }
            }
            
        }
        
        return true;
        
        
    }
    
    public class Pair{
        int v; // vertex
        
        int l;// level
        
        Pair(int v, int l){
            this.v = v;
            this.l = l;
        }
    }
}
