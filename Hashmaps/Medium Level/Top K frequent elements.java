QUESTION LINK - https://leetcode.com/problems/top-k-frequent-elements/

=======================================================================================================================================================================
  
  class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums.length;i++){
            
            if(hm.containsKey(nums[i])){
                int oldFreq = hm.get(nums[i]);
                int newFreq = oldFreq +1;
                hm.put(nums[i],newFreq);
            }
            
            else{
                hm.put(nums[i],1);
            }
        }
        
        Queue<Integer> q = new PriorityQueue<>((a,b) -> hm.get(b)-hm.get(a));
        
        for(int key : hm.keySet()){
            q.add(key);
        }
        
        int ans[] = new int[k];
        for(int i = 0 ; i<k; i++){
            ans[i] = q.poll();
        }
        
        return ans;
    }
}
