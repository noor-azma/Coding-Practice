QUESTION LINK - https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
VIDEO LINK - https://www.youtube.com/watch?v=GLxfoaZlRqs
See  VIDEO
========================================================ANSWER=====================================================================================
  

class Solution {
   // Function to detect cycle in a directed graph.
   public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
       // code here
       boolean vis[]=new boolean[V];
       boolean dfsvis[]=new boolean[V];
       for(int i=0;i<V;i++)
       {
           if(vis[i]==false)
           {
               if(checkCycle(i,vis,dfsvis,adj)==true)
               {
                   return true;
               }
           }
       }
       return false;
   }

public boolean checkCycle(int i, boolean vis [],boolean dfsvis [],ArrayList<ArrayList<Integer>> adj)
{
   vis[i]=true;
   dfsvis[i]=true;
   for(int ele:adj.get(i))
   {
       if(vis[ele]==false)
       {
           if(checkCycle(ele,vis,dfsvis,adj)==true)
               {
                   return true;
               }
       }
       else if(dfsvis[ele]==true)
       {
           return true;
       }
   }
   dfsvis[i]=false;
   return false;
    }
}
