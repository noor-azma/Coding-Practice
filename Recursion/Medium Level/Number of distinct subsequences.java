QUESTION LINK - https://practice.geeksforgeeks.org/problems/number-of-distinct-subsequences0909/1
VIDEO LINK - pepcoding

========================================================ANSWER=====================================================================================
  

class Solution {
    int distinctSubsequences(String S) {
        
        Set<String> set = new HashSet<>();
        
        ArrayList<String> ans = helper(S);
        
        for(String str : ans){
            set.add(str);
        }
        return set.size();
       
    }
    
    ArrayList<String> helper(String S){
        
        if(S.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        String smallString = S.substring(1);
        
        ArrayList<String> smallAns = helper(smallString);
        
        ArrayList<String> bigAns = new ArrayList<>();
        
        for(String str : smallAns){
            
            bigAns.add(""+ str);
            bigAns.add(S.charAt(0) + str);
        }
        
        return bigAns;
    }
    
}

---------------------------------------------------------------------------------------------------------------------------------------------------
  
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
