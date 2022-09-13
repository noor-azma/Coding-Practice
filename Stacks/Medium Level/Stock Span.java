QUESTION LINK - https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
VIDEO LINK - pepcoding

========================================================ANSWER=====================================================================================
  

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
       Stack<Integer> st = new Stack<>();
       
       int ansSpan[] = new int[n];
       
       for(int i=0; i<n; i++){
           
           while(st.size()>0 && price[i] >= price[st.peek()]){
               st.pop();
           }
           
           if(st.size()==0){
               
               ansSpan[i] = i+1;
               
           }
           
           else ansSpan[i] = i - st.peek();
           
           
           st.push(i);
           
       }
       
       return ansSpan;
    }
    
}
