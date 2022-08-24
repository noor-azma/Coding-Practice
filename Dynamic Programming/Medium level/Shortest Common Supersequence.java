QUESTION LINK - https://practice.geeksforgeeks.org/problems/shortest-common-supersequence0322/1
VIDEO LINK - https://www.youtube.com/watch?v=823Grn4_dCQ&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=24

========================================================ANSWER=====================================================================================
//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    
    // formula to find length of shortest common supersequence m+n - LCS(m,n) where lcs is longest common subsequence
   
   
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int LCS = LCS(X, Y, m,n);
        return m+n-LCS;
    
    }
    
    public static int LCS (String s1, String s2, int m, int n){
        
        int dp[][] = new int[m+1][n+1];
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                     dp[i][j]= 1+ dp[i-1][j-1];
                }
                
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        
        return dp[m][n];
        
    }
}
