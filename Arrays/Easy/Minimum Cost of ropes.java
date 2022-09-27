QUESTION LINK - https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

========================================================ANSWER=====================================================================================
  
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
       
       PriorityQueue<Long> pq = new PriorityQueue<>();
       
       for(int i=0; i<n; i++) pq.add(arr[i]);
       long ans =0;
       while(pq.size() >=2){
           
           long x = pq.poll(), y= pq.poll();
           ans += x+y;
           pq.add(x+y);
       }
       
    return ans;
       
     
    }
}
