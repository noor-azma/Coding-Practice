QUESTION LINK - https://practice.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right3011/1
VIDEO LINK - https://www.youtube.com/watch?v=IvlhR95PBeM

========================================================ANSWER=====================================================================================
  
class Solution
{
    long x;
    long y;
    long mod = 1000000007;
    long dp[][];
    long numberOfPaths(int m, int n)
    {
        x=m;
        y=n;
        dp =  new long[101][101];
        return count(0,0);
        
    }
    
    long count (int i, int j){
        
        if(i==x-1 || j==y-1) return 1;
        
        if(dp[i][j] != 0) return dp[i][j];
        long right = count(i, j+1);
        long down = count(i+1, j);
        
        return dp[i][j] = (right+down)%mod;
    }
}
