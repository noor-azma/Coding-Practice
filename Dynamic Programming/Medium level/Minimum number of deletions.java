QUESTION LINK - https://practice.geeksforgeeks.org/problems/minimum-number-of-deletions4610/1
VIDEO LINK - https://www.youtube.com/watch?v=CFwCCNbRuLY&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=27
THIS QUESTION IS SOLVED USING LONGEST COMMON SUBSEQUENCE, LCS REQUIRES 2 STRINGS BUT WE ARE ONLY GIVEN 1 STRING SO WE REVERSE THE STRING AND USE IT IN ORDER TO OBTAIN ANSWER

FIRST STRING - S;
SECOND STRING - s2; (reverse of S)

Now we perform LCS as usual to get the answer.
  
FORMULA = TOTAL LENGTH - LCS
========================================================ANSWER=====================================================================================
 //{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String str = read.readLine().strip();
            Solution ob = new Solution();
            long ans = ob.minDeletions(str, n); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int minDeletions(String str, int n)
    {
        String str2 = reverse(str);
        int m = n;
        // code here
        
        int length = LCS(str, str2, m, n);
        return n - length;
    }
    
    public static String reverse(String str){
        
        String reverse ="";
        for(int i=str.length()-1; i>=0; i--){
          reverse += str.charAt(i);  
        }
        return reverse;
        
    }
    
    public static int LCS(String s1, String s2, int m, int n){
        
        int dp[][]= new int[m+1][n+1];
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                
                if(i==0 || j==0) dp[i][j] =0;
            }
        }
        
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                
                if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1+ dp[i-1][j-1];
                else dp[i][j] =Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        
        return dp[m][n];
    }
} 
