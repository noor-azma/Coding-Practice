QUESTION LINK - https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
VIDEO LINK - dry run

========================================================ANSWER=====================================================================================
  
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<n; i++){
            
            pq.add(arr1[i]);
            
            if(pq.size() > k) pq.poll();
        }
        
        for(int i=0; i<m; i++){
            
            pq.add(arr2[i]);
            
            if(pq.size() > k) pq.poll();
        }
        
        return pq.peek();
    }
}
