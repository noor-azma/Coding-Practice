QUESTION LINK - https://practice.geeksforgeeks.org/problems/e015cb4d3f354b035d9665e7c8a54a7aefb1901b/1
VIDEO LINK - https://classroom.codingninjas.com/app/classroom/me/10278/content/172388/offering/2139213/problem/390https://practice.geeksforgeeks.org/problems/e015cb4d3f354b035d9665e7c8a54a7aefb1901b/1

========================================================ANSWER=====================================================================================
  
class Solution {
    public static int checkRedundancy(String s) {
       
       Stack<Character> st = new Stack<>();
       
       for(int i=0; i<s.length(); i++){
           
           if(s.charAt(i) == ')' ){
               
               char ch = st.peek();
               st.pop();
               int flag = 1; // we assuming that expression is redudant
               
               while(ch != '('){
                   
                   if(ch == '+' || ch == '-' || ch == '*' || ch == '/') flag = 0;
                   
                   ch = st.peek();
                   st.pop();
                   
               }
               
               
               
               if(flag == 1) return 1; // after coming out of while loop if flag is still 1 it is redundant 
               
           }
           
           
           else{
               
               st.push(s.charAt(i));
           }
           
           
           
       }
       
       
       return 0; // not redundant
       
    }
}
