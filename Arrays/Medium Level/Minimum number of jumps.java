QUESTION LINK - https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
VIDEO LINK - https://www.youtube.com/watch?v=CqgK_qi4SKQ&t=64s
ITS A SHITTY QUESTION WATCH VIDEO 3 TIMES TO UNDERSTAND
========================================================ANSWER=====================================================================================
 
// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        
      int maxReach= arr[0];
      int step = arr[0];
      int jump = 1;
      
       if(arr[0]== 0 && arr.length>1) return -1;
          
         if(arr.length <= 1) return 0;
      
      for(int i=1; i<arr.length; i++){
         
         if(i == arr.length - 1) return jump;
         
         maxReach = Math.max(maxReach, arr[i]+i);
         step--;
         
         if(step == 0){
             
             jump++;
             if(i>=maxReach) return -1;
             
             step = maxReach - i;
         }
         
          
          
      }
      
      return -1;
    }
}
