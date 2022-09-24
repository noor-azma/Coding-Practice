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
