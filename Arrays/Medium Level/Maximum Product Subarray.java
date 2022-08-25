QUESTION LINK - https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/0
VIDEO LINK -https://www.youtube.com/watch?v=tHNsZHXnYd4

========================================================ANSWER=====================================================================================
 //{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        
        long ans = arr[0];
        long maxP = ans;
        long minP = ans;
        
        for(int i =1; i<arr.length; i++){
           
           if(arr[i] < 0){
               long temp = maxP;
               maxP = minP;
               minP = temp;
           }
            maxP = Math.max(arr[i] , arr[i]*maxP);
            minP = Math.min(arr[i] , arr[i]*minP);
            
            ans = Math.max(maxP, ans);
            
        }
        
        return ans;
    }
}
