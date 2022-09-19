QUESTION LINK - https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
VIDEO LINK - https://www.youtube.com/watch?v=UeE67iCK2lQ&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=5

========================================================ANSWER=====================================================================================
  
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
       ArrayList<Integer> ans = new ArrayList<>();
       boolean visited[] = new boolean[V];
     
               
                Queue<Integer> q = new LinkedList<>();
                q.add(0);
                visited[0] = true;
                
                while(!q.isEmpty()){
                    Integer frontNode = q.poll();
                    ans.add(frontNode);
                    
                    for(Integer j : adj.get(frontNode)){
                        if(visited[j] == false){
                           
                            visited[j] = true;
                             q.add(j);
                        }
                    }
                }
        
       
       return ans;
       
    }
}


======================IF DISCONNECTED GRAPH IS GIVEN===============================
  
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
       ArrayList<Integer> ans = new ArrayList<>();
       boolean visited[] = new boolean[V];
       
       for(int i=0; i<V; i++){
           
           if(visited[i] == false){
               
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                
                while(!q.isEmpty()){
                    Integer frontNode = q.poll();
                    ans.add(frontNode);
                    
                    for(Integer j : adj.get(frontNode)){
                        if(visited[j] == false){
                            q.add(j);
                            visited[j] = true;
                        }
                    }
                }
           }
           
           
       }
       
       return ans;
       
    }
}
