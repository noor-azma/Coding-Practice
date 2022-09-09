QUESTION LINK - https://practice.geeksforgeeks.org/problems/reverse-a-stack/1
VIDEO LINK - https://www.youtube.com/watch?v=8YXQ68oHjAs

========================================================ANSWER=====================================================================================
  
class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        
        if(s.size() == 1) return;
        
        int temp = s.pop();
        reverse(s);
       
        push(s , temp);
    }
    
    static void push(Stack<Integer> s, int temp){
        if(s.size()== 0) {
            s.push(temp);
            return;
        }
        
        int value = s.pop();
        push(s, temp);
        s.push(value);
        return;
        
    }
    
}
