QUESTION LINK - https://practice.geeksforgeeks.org/problems/stack-permutations/1
VIDEO LINK - https://www.youtube.com/watch?v=Rkx2ru2q5S0

========================================================ANSWER=====================================================================================

class Solution {
   public static int isStackPermutation(int n, int[] ip, int[] op) {
       // code here
       Stack<Integer> st = new Stack<>();
       int j=0;
       
       for(int i=0;i<n;i++){
           
           st.push(ip[i]);
           while(!st.isEmpty() && st.peek() == op[j]){
               st.pop();
               j++;
           }
       }
       
       if(st.isEmpty()){
           return 1;
       }
       return 0;
   }
}
