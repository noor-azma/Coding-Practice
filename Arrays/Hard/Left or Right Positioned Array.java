QUESTION LINK - https://practice.geeksforgeeks.org/problems/left-or-right-positioned-array5757/1
VIDEO LINK - check gfg link

========================================================ANSWER=====================================================================================
  


class Solution {

     // Function to check Left or Right Positioned
    // Array.
    // arr[] is array of n elements
    // visited[] is boolean array of size n
    public static boolean leftRight(int arr[],int n)
    {
        // array to keep record of visited element
        int visited[] = new int[n];
        
        
        //Traversig thru each element of visted array
        for(int i=0; i<n; i++){
            
            if(arr[i] < n){
                
                //this will hold true of left checking
                if(visited[arr[i]] == 0)
                visited[arr[i]] =1;
                
                //this will hold true of right checking
                else
                visited[n - arr[i] -1] = 1;
            }
        }
        
        for(int i=0; i<visited.length; i++){
            if(visited[i] == 0) return false;
            //return true;
        }
        
        return true;
    }
}
  
 
