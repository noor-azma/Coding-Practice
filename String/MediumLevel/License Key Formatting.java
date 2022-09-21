QUESTION LINK - https://practice.geeksforgeeks.org/problems/license-key-formatting/1
VIDEO LINK - Dry run

========================================================ANSWER=====================================================================================

class Solution{
    static String ReFormatString(String S, int k){
        
        int n = S.length();
        
        if(n==0 || S.equals("-")) return "";
        
        Stack<Character> st = new Stack<>();
        int dashCount = 0;
        
        for(int i=n-1; i>= 0; i--){
            
            if(S.charAt(i) == '-') {
                continue;
            }
            
            else{
                
                char temp = S.charAt(i);
                st.push(Character.toUpperCase(temp));
            }
            
            if((st.size() - dashCount) % k == 0 && i!=0 ){
                
                st.push('-');
                dashCount++;
                
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(st.peek() == '-') st.pop();
        
        int t = st.size(); // we have to store the original length of stack in a variable and the use it coz the length keeps changing
        
        for(int i=0; i<t; i++){
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
}
