Question Link - https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1

APPROACH - Hashmap

======================================================================ANSWER===========================================================================================

//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int count = 0;
        
        
        for(int i=0; i<n; i++){
            
            //counting the pairs
            if(hm.containsKey(k - arr[i])){
                count += hm.get(k - arr[i]);
            }
            
            //filling the hashmap
            if(hm.containsKey(arr[i])){
                hm.put( arr[i] , hm.get(arr[i])+1 );
            }
            
            else{
                hm.put( arr[i] , 1);
            }
            
            //hashmap can also be filled in one line using this code below
            // hm.put( arr[i] , hm.getOrDefault( arr[i] , 0) + 1);
        }
        
        return count;
    }
}
