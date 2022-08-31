QUESTION LINK - https://practice.geeksforgeeks.org/problems/count-element-occurences/0?page=1&curated%5B%5D=7&sortBy=submissions
  
APPROACH - Use HashMap

======================================================================ANSWER===========================================================================================
  
  

class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int x = n/k;
        int count =0;
        
        for(int i =0; i<n; i++){
            
            if(hm.containsKey(arr[i])){
                
                int oldfreq = hm.get(arr[i]);
                
                hm.put(arr[i], oldfreq+1 );
            }
            
            else 
            hm.put(arr[i], 1);
        }
        
        for(int ele : hm.keySet()){
            
            if(hm.get(ele) > x){
                
                count++;
            }
        }
        
        return count;
    }
}
