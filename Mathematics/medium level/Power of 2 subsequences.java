QUESTION LINK - https://practice.geeksforgeeks.org/problems/power-of-2-and-subsequences0759/1
VIDEO LINK - https://www.youtube.com/watch?v=vvU9HuwtRWQ

========================================================ANSWER=====================================================================================
  
class Solution{
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        
        int count = 0;
        int mod= 1000000007;
        
        for(Long i : A){
            
            if((i& (i-1)) ==0){
                count++;
            }
        }
        
        
        return (long)(Math.pow(2, count)%mod -1 )%mod;
    }
}
