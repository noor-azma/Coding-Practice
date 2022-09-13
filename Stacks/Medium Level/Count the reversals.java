QUESTION LINK - https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1

========================================================ANSWER=====================================================================================

class Sol
{
    int countRev (String s)
    {
        Stack<Character> st = new Stack<>();
        double openBCounter = 0;
        double closedBCounter = 0;
        
        if(s.length()%2 != 0) return -1;
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) == '{'){
                st.push(s.charAt(i));
                openBCounter++;
                
            }
            
            else if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{'){
                
                st.pop();
                openBCounter--;
            }
            
            else{
                
                closedBCounter++;
            }
            
        }
        
        double a = (int)Math.ceil(openBCounter/2);
        double b = (int)Math.ceil(closedBCounter/2);
        
        return (int)(a+b);
    }
}
