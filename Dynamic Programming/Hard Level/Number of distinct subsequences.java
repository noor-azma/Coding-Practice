QUESTION LINK - https://practice.geeksforgeeks.org/problems/number-of-distinct-subsequences0909/1
VIDEO LINK - pepcoding 

========================================================ANSWER=====================================================================================
  
class Solution {
    int distinctSubsequences(String S) {
        
        int n = S.length();
        int dp[] =new int[n+1];
        int mod =1000000007;
        
        dp[0] = 1;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i= 1; i<=n; i++){
            
            dp[i] = (2*dp[i-1])%mod;
            
            char ch = S.charAt(i-1);
            
            if(hm.containsKey(ch)){
                
                int j = hm.get(ch);
                
                dp[i] = (dp[i] - dp[j-1] + mod)%mod;
                
            }
            
            hm.put(ch, i);
            
        }
        
        return (dp[n])%mod;
    }
    
}
