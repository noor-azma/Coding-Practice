QUESTION LINK - https://leetcode.com/problems/longest-common-subsequence/submissions/
VIDEO LINK - https://www.youtube.com/watch?v=g_hIx4yn9zg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=20
           - https://www.youtube.com/watch?v=hR3s9rGlMTU&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=21

========================================================MEMOIZATION CODE=====================================================================================
class Solution {
    
    static int[][] dp = new int[1001][1001];
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                
                dp[i][j] = -1;
            }
        }
        
        return helper(text1, text2, m, n);
        
    }
    public int helper(String text1, String text2, int m, int n) {
        
        //base case
        if(m==0 || n==0) return 0;
        
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        
        //choice diagram
        if(text1.charAt(m-1) == text2.charAt(n-1)){
            return dp[m][n] = 1+helper(text1,text2, m-1, n-1);
        }
        else{
            
            return dp[m][n] = Math.max(helper(text1,text2, m, n-1), helper(text1,text2, m-1, n));
            
        }
    }
}

======================================================================TOP-DOWN APPROACH(TABULATION)====================================================================
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();
        
        int dp[][] = new int[m+1][n+1];
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j< dp[0].length; j++){
                
                if(i==0||j==0){
                    dp[i][j] = 0;
                }
            }
        }
        
         
        for(int i=1; i<dp.length; i++){
            for(int j=1; j< dp[0].length; j++){
                
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                   dp[i][j] = 1 + dp[i-1][j-1]; 
                }
                
                else{
                     dp[i][j] = Math.max(dp[i][j-1],  dp[i-1][j]); 
                    
                }
            }
        }
        
        return dp[m][n];
        
    }
}
