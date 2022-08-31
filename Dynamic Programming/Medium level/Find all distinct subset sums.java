QUESTION LINK - https://practice.geeksforgeeks.org/problems/find-all-distinct-subset-or-subsequence-sums4424/1
VIDEO LINK - https://www.youtube.com/watch?v=3E2e_yU3a5k

========================================================ANSWER=====================================================================================
class Solution
{
    
    
    public int[] DistinctSum(int[] nums)
    {
        
        int dp[][] =new int[101][10001]; 
        Set<Integer> set = new HashSet<>();
	  helper(nums, 0, 0, set, dp);
        int[] ans = new int[set.size()];
        
        int i =0;
        
        for(int ele : set){
            
            ans[i] = ele;
            i++;
        }
        
        Arrays.sort(ans);
        return ans;
       
    }
    
    public void helper(int[] nums, int index , int sum ,Set<Integer> set ,int[][]dp){
        
        int N = nums.length;
        
        if(index == N){
            
           set.add(sum); 
            return;
        }

	  if(dp[index][sum] != 0){
            return;
        }
        
        dp[index][sum] = 1;
	      helper(nums , index+1, sum, set, dp);
        helper(nums , index+1, sum+nums[index],set, dp);
        
    }
}
