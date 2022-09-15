QUESTION LINK - https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1

========================================================ANSWER=====================================================================================
  
class Solution {
    
    public String reverse(String S){
        
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            
            s.push(S.charAt(i));
        }
        
        String ans = "";
        
        while(!s.isEmpty()){
            ans += s.pop();
        }
        
        return ans;
    }

}
