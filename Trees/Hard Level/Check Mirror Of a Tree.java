QUESTION LINK - https://practice.geeksforgeeks.org/problems/check-mirror-in-n-ary-tree/0
VIDEO LINK - https://www.youtube.com/results?search_query=check+mirror+in+n-ary+tree+java

========================================================ANSWER=====================================================================================
  
class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        
        Map<Integer, ArrayDeque<Integer>> map = new HashMap<>();
        
        for(int i=0; i<2*e; i+=2){
            
            if(map.containsKey(A[i])){
                
                map.get(A[i]).push(A[i+1]);
            }
            
            else{
                
                ArrayDeque<Integer> stack = new ArrayDeque<>();
                stack.push(A[i+1]);
                map.put(A[i], stack);
            }
        }
        
        for(int i=0; i<2*e; i+=2){
            if(map.get(B[i]).peek() != B[i+1]) return 0;
            map.get(B[i]).pop();
        }
        
        return 1;
    }
}
