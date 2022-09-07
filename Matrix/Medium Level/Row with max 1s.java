QUESTION LINK - https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
VIDEO LINK - https://www.youtube.com/watch?v=1iSJhfje97I

========================================================ANSWER=====================================================================================
  
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        
        int row = -1;
        int col = m-1;
        // traversing row by row
        for(int i=0; i<n; i++){
          //last column to first
            for(int j=col; j>=0; j--){
                
                if(arr[i][j] == 1){
                    
                    row =i;
                  //we will not see the same col again
                    col--;
                }
                //if u see zero then skip that row
                else break;
            }
        }
        
        return row;
            
    }
}
 
