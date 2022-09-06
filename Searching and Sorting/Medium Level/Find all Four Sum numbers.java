QUESTION LINK - https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1
VIDEO LINK - Ask adarsh

========================================================ANSWER=====================================================================================
  
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        
        for(int i = 0; i<n-3; i++){
            int p = arr[i];
            
            for(int j = i+1; j<n-2; j++){
                
                int q = arr[j];
                
                int l=j+1;
                int r=n-1;
                
                while(l<r){
                    
                    int sum = p + q + arr[l] + arr[r];
                    
                    if(sum == k){
                        ArrayList<Integer> ar = new ArrayList<>();
                        ar.add(p);
                        ar.add(q);
                        ar.add(arr[l]);
                        ar.add(arr[r]);
                        
                        Collections.sort(ar);
                        
                        if(!ans.contains(ar)) ans.add(ar);
                        
                        l++;
                        r--;
                    }
                    
                    else if(sum < k){
                      l++;  
                    }
                    
                    else{
                      r--;  
                    }
                    
                }
                
            }
        }
        
        return ans;
    }
}
