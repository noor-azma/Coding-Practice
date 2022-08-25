QUESTION LINK - https://practice.geeksforgeeks.org/problems/longest-repeating-subsequence2004/1
VIDEO LINK - https://www.youtube.com/watch?v=hbTaCmQGqLg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=30

Approach - we take the same string as 2nd one and iterate through it and add aditional condition when i is not equal to j
========================================================ANSWER=====================================================================================
  
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        
        int m = str.length();
        String str2 = str;
        int n = m;
        int dp[][] = new int[m+1][n+1];
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                
               if(i==0 || j==0) dp[i][j] =0;
            }
        }
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                
               if((str.charAt(i-1)== str2.charAt(j-1) && i!=j )) dp[i][j] = 1 + dp[i-1][j-1];
               
               else dp[i][j] = Math.max( dp[i-1][j] ,  dp[i][j-1]);
            }
        }
        
        return dp[m][n];
    }
}
