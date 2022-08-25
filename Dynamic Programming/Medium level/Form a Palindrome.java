QUESTION LINK - https://practice.geeksforgeeks.org/problems/form-a-palindrome1455/1
VIDEO LINK - https://www.youtube.com/watch?v=AEcRW4ylm_c&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=31

Also called as min num of insertions in a string to form a palindrome which is similar to the question of number or insertions and deletions.

========================================================ANSWER=====================================================================================
//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countMin(String str)
    {
        String s2 = reverse(str);
        
        int m = str.length();
        int n =m;
        
        int LCS = LCS(str,s2, m , n);
        
        int ans = m - LCS;
        
        return ans;
    }
    
    
    public static String reverse(String s1){
       String rev ="";
       for(int i = s1.length()-1; i>=0; i--){
           rev += s1.charAt(i);
       }
       
       return rev;
        
    }
    
    public static int LCS(String s1, String s2, int m , int n){
        
        int dp[][] = new int[m+1][n+1];
        
        for(int i=0; i<dp.length; i++){
            
            for(int j=0; j<dp[0].length; j++){
                
                if(i==0 || j==0) dp[i][j] =0;
                
            }
        }
        
        for(int i=1; i<dp.length; i++){
            
            for(int j=1; j<dp[0].length; j++){
                
                if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1+ dp[i-1][j-1];
                
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                
            }
        }
        
        return dp[m][m];
    }
}
